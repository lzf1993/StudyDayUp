package designpatten.interpreter_20.test3.impl.mult;

import java.util.List;

import org.w3c.dom.Element;

import designpatten.interpreter_20.test3.Context;
import designpatten.interpreter_20.test3.ReadXmlExpression;


public class PropertysTerminalExpression implements ReadXmlExpression{

	//��������
	private String name;
	
	
	public PropertysTerminalExpression(String name){
		this.name = name;
	}
	
	@Override
	public String[] interpret(Context ctx) {
		List<Element> eles = ctx.getPreEles();
		
		String ss[] = new String[eles.size()];
		for(int i=0;i<ss.length;i++){
			ss[i] = eles.get(i).getAttribute(this.name);
		}
		return ss;
	}

}
