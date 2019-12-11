package designpatten.interpreter_20.test1.impl;

import org.w3c.dom.Element;

import designpatten.interpreter_20.test1.Context;
import designpatten.interpreter_20.test1.ReadXmlExpression;

//Ԫ�� - ��Ϊ�ս����Ӧ�Ľ�����
public class ElementTerminalExpression extends ReadXmlExpression{

	
	//Ԫ�ص�����
	private String eleName = "";
	
	
	public ElementTerminalExpression(String eleName){
		this.eleName = eleName;
	}
	
	
	@Override
	public String[] interpret(Context c) {
		
		//��ȡ���������е�ǰ��Ԫ����Ϊ����Ԫ��
		Element pEle = c.getPreEle();
		
	    //���ҵ���ǰԪ�����ƶ�Ӧ��xmlԪ��
		Element ele = null;
	    if(pEle==null){
	    	//˵�����ڻ�ȡ���Ǹ�Ԫ��
	    	ele = c.getDocument().getDocumentElement();
	    	c.setPreEle(ele);
	    }else{
	    	//���ݸ���Ԫ�غ�Ҫ���ҵ�Ԫ����������ȡ -- ��ǰԪ��
	    	ele = c.getNowEle(pEle, eleName);
	    	//����ȡ��Ԫ�طŵ���������
	    	c.setPreEle(ele);
	    }
		String [] ss = new String[1];
		//��ȡԪ�ص�����
		ss[0] = ele.getFirstChild().getNodeValue();
		return ss;
	}

}
