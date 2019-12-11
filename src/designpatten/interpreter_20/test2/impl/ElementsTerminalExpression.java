package designpatten.interpreter_20.test2.impl;


import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;

import designpatten.interpreter_20.test2.Context;
import designpatten.interpreter_20.test2.ReadXmlExpression;

//Ԫ����Ϊ�ս����Ӧ�Ľ�����
public class ElementsTerminalExpression  implements ReadXmlExpression{

	
	//Ԫ�ص�����
	private String eleName = "";
	
	public ElementsTerminalExpression(String eleName){
		this.eleName = eleName;
	}
	
	
	/**
	 *  
	 *  <b>
         <c name="testC">123456</c>
        </b> 
        
                     ����Ԫ�أ����ݵ�ǰ��Ԫ�غ�Ԫ�ص����ƣ�����Ԫ�ص�����
                     ���ݸ�Ԫ��"b" ��Ԫ�ص����� "c " ���������� ��123456        
	 *  
	 * @param ctx
	 * @return
	 */
	@Override
	public String[] interpret(Context ctx) {
		
		//��ȡ�����ĵ�ǰ�ĸ�Ԫ����Ϊ����Ԫ��
		List<Element> pEles = ctx.getPreEles();
		
		//���Ҷ��Ԫ��
		List<Element> nowEles = new ArrayList<>();
		for(Element ele : pEles){
			nowEles.addAll(ctx.getNowEles(ele, eleName));
		}
		
		//���ҵ�ǰԪ�����ƶ�Ӧ��xmlԪ��
		Element ele = null;
		if(pEles.size()==0){
			//˵�����ڻ�ȡ���Ǹ�Ԫ��
			ele = ctx.getDocument().getDocumentElement();
		}else{
			ele = ctx.getNowEles(pEles.get(0) , eleName).get(0);
		}
		
		//Ȼ���ȡ���Ԫ�ص�ֵ
		String [] ss = new String[1];
		ss[0] = ele.getFirstChild().getNodeValue();
		return ss;
	}

}
