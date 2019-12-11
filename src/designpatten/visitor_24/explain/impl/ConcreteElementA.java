package designpatten.visitor_24.explain.impl;

import designpatten.visitor_24.explain.Element;
import designpatten.visitor_24.explain.Visitor;

/**
 *  @author lzf
 *  ����Ԫ�ص�ʵ�ֶ���A
 */
public class ConcreteElementA extends Element{

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementA(this);
	}  
	
	public void operationA(){
		System.out.println("���еĹ���ʵ��A");
	}

}
