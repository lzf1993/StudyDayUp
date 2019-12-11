package designpatten.visitor_24.explain;

import designpatten.visitor_24.explain.impl.ConcreteElementA;
import designpatten.visitor_24.explain.impl.ConcreteElementB;

public class ConcreteVisitor1 implements Visitor{

	@Override
	public void visitConcreteElementA(ConcreteElementA elementA) {
		//������Ҫ����Ԫ�����еĹ���
		elementA.operationA();		
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB elementB) {
       //������Ҫ����Ԫ�����еĹ���
		elementB.operationB();
	}

}
