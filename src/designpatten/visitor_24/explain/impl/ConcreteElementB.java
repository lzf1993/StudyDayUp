package designpatten.visitor_24.explain.impl;

import designpatten.visitor_24.explain.Element;
import designpatten.visitor_24.explain.Visitor;

/**
 * @author lzf
 *  ����ʵ��Ԫ��B
 */
public class ConcreteElementB extends Element{

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementB(this);	
	}

	
	public void operationB(){
		System.out.println("���е�ʵ�ֹ���B");
	}
	
}
