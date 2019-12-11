package designpatten.interpreter_20.test3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import designpatten.interpreter_20.test3.ReadXmlExpression;
import designpatten.interpreter_20.test3.impl.mult.ElementsExpession;
import designpatten.interpreter_20.test3.impl.mult.ElementsTerminalExpression;
import designpatten.interpreter_20.test3.impl.mult.PropertysTerminalExpression;
import designpatten.interpreter_20.test3.impl.single.ElementExpression;
import designpatten.interpreter_20.test3.impl.single.ElementTerminalExpression;
import designpatten.interpreter_20.test3.impl.single.PropertyTerminalExpression;

//������
public class Parser {


	//��ַ�
	private final static String BACKLASH = "/";
	private final static String DOT = ".";
	private final static String DOLLAR = "$";

	//���ղ�ֵ��Ⱥ󣬼�¼��Ҫ������Ԫ�ص�����
	private static List<String> listEle = null;


	private Parser(){

	}


	/**
	 * ����һ�����ʽ��ͨ����������ϳ�һ��������﷨��
	 * @param expr ���ʽ
	 * @return ��ϵĳ�����﷨��
	 */
	public static ReadXmlExpression praise(String expr){
		listEle = new ArrayList<>();

		//1���ֽ���ʽ���õ���Ҫ������Ԫ�غ͸�Ԫ�ض�Ӧ�Ľ���ģ��
		Map<String,ParserModel> mapPath = parseMapPath(expr);;

		//2�����ݽڵ������ת������Ӧ�Ľ���������
		List<ReadXmlExpression> list = mapPath2Interpreter(mapPath);

		//3����ϳ����﷨����һ�������Ⱥ�˳�������
		ReadXmlExpression expression = builderTree(list);

		return expression;
	}




	/**
	 *  ��һ�������մ����ҵ�˳�����ֽ���ʽ���õ���Ҫ������Ԫ������
	 * @param expr ��Ҫ�ֽ�ı��ʽ
	 * @return �õ���Ҫ�Ľ�����Ԫ������ -- ��Ӧ��Ԫ�ص�ģ��
	 */
	private static Map<String,ParserModel> parseMapPath(String expr){
		//�Ȱ��� "/" �и��ַ���
		StringTokenizer tokenizer = new StringTokenizer(expr, BACKLASH);

		//��ʼ��һ��map������ŷֽ��ֵ
		Map<String,ParserModel> map = new HashMap<>();
		while(tokenizer.hasMoreTokens()){
			String onePath = tokenizer.nextToken();
			//������һ��ֵ��˵���������һ��Ԫ��
			if(tokenizer.hasMoreTokens()){
				//Ҳ��������
				setParsePath(false,onePath,false,map);
			}
			//�����һ��Ԫ��
			else{
				int dotIndex = onePath.indexOf(DOT);
				if(dotIndex>0){
					//˵����Ҫ��ȡ���Ե�ֵ
				}else{
					//˵��ҪȡԪ�ص�ֵ�����������һ��Ԫ�ص�ֵ
					setParsePath(true,onePath,false,map);
				}

			}
		}
		return map;
	}


	/**
	 * ��װ�ֽ������λ�ú�������������Ҫ������Ԫ������
	 * @param end �Ƿ������һ��
	 * @param ele Ԫ������
	 * @param propertyValue �Ƿ�ȡ����
	 * @param map ������Ҫ������Ԫ�����ƣ����и�Ԫ�ض�Ӧ�Ľ���ģ�͵�map
	 */
	private static void setParsePath(boolean end, String ele, boolean propertyValue, Map<String, ParserModel> map) { 
		ParserModel m = new ParserModel();
		m.setEnd(end);
		//�������$���ţ�˵������һ��ֵ
		m.setSingleValue(!(ele.indexOf(DOLLAR)>0));
		m.setPropertyValue(propertyValue);
		//ȥ��$
		ele = ele.replace(DOLLAR, "");
		map.put(ele, m);
		listEle.add(ele);	
	}


	
	
	/**
	 * �ڶ������ѽ���������Ԫ�����Ƹ��ݶ�Ӧ�Ľ���ģ��ת�������Ӧ�Ľ���������
	 * @param map
	 * @return
	 */
	private static List<ReadXmlExpression> mapPath2Interpreter(Map<String,ParserModel> map){
		List<ReadXmlExpression> list = new ArrayList<>();
		//һ�����շֽ���Ⱥ�˳����ת������������
		for(String key:listEle){
			ParserModel pm = map.get(key);
			ReadXmlExpression obj = null;
			if(!pm.isEnd()){
				//�������һ������һ��ֵ��ת��Ϊ��
				if(pm.isSingleValue()){
					obj = new ElementExpression(key);
				}else{
					//�������һ�����Ƕ��ֵ��ת��Ϊ��
					obj = new ElementsExpession(key);
				}
			}else{
				//�����һ��ֵ,����������
				if(pm.isPropertyValue()){
					//�ǵ���ֵ
					if(pm.isSingleValue()){
						obj = new PropertyTerminalExpression(key);
					}else{
						obj = new PropertysTerminalExpression(key);
					}
				}else{	
					//�����һ������һ��ֵ��ȥԪ�ص�ֵ��ת��Ϊ
					if(pm.isSingleValue()){
						obj = new ElementTerminalExpression(key);
					}else{
						obj = new ElementsTerminalExpression(key);
					}
				}
			}
			//��ת����Ķ�����ӵ�������
			list.add(obj);
		}
		return list;
	}



	/**
	 * �����������������������ظ��ڵ�
	 * @param list
	 * @return
	 */
	private static ReadXmlExpression builderTree(List<ReadXmlExpression> list) {
		//�����﷨���ĸ�
		ReadXmlExpression returnRe = null;
		//
		ReadXmlExpression preRe = null;
		for(ReadXmlExpression re:list){
			if(preRe == null){
				preRe =re;
				returnRe = re;
			}else{
				if(preRe instanceof ElementExpression){
					ElementExpression ele = (ElementExpression) preRe;
					ele.addEle(re);
					preRe = ele;
				}else if(preRe instanceof ElementsTerminalExpression){
					ElementsExpession ele = (ElementsExpession) preRe;
					ele.addEle(re);
					preRe = ele;
				}
			}
		}
		//���ظ�Ԫ��
		return returnRe;
	}


}
