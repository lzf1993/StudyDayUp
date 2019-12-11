package designpatten.interpreter_20.test1.impl;

import designpatten.interpreter_20.test1.Context;
import designpatten.interpreter_20.test1.ReadXmlExpression;



// ���� -- ��Ϊ �ս����Ӧ�Ľ�����
public class PropertyTerminalExpression extends ReadXmlExpression{

	//���Ե����� ���磺 root/a/b/c.name
	private String propName;
	
	
	public PropertyTerminalExpression(String propName){
	  this.propName = propName;	
	}
	
	
	@Override
	public String[] interpret(Context c) {
		
		//ֱ�ӻ�ȡ����Ԫ�����Ե�ֵ
		String[] ss = new String[1];
		//���ݵ�ǰԪ�ز������Ե�ֵ
		ss[0] = c.getPreEle().getAttribute(this.propName);	
		System.out.println("ss[0] == "+ss[0]);
		return ss;
	}

}
