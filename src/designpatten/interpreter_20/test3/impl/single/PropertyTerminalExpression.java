package designpatten.interpreter_20.test3.impl.single;

import designpatten.interpreter_20.test3.ReadXmlExpression;
import designpatten.interpreter_20.test3.Context;


// ���� -- ��Ϊ �ս����Ӧ�Ľ�����
public class PropertyTerminalExpression implements ReadXmlExpression{

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
		ss[0] = c.getPreEles().get(0).getAttribute(this.propName);	
		System.out.println("ss[0] == "+ss[0]);
		return ss;
	}

}
