package designpatten.interpreter_20.test3.impl.single;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;

import designpatten.interpreter_20.test3.Context;
import designpatten.interpreter_20.test3.ReadXmlExpression;


//Ԫ�� - ��Ϊ�ս����Ӧ�Ľ�����
public class ElementTerminalExpression implements ReadXmlExpression{

	
	//Ԫ�ص�����
	private String eleName = "";
	
	
	public ElementTerminalExpression(String eleName){
		this.eleName = eleName;
	}
	
	
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
