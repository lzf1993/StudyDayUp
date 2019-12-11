package designpatten.visitor_24.explain;

import designpatten.visitor_24.explain.impl.ConcreteElementA;
import designpatten.visitor_24.explain.impl.ConcreteElementB;

//�����߽ӿ�
public interface Visitor {

	//�����豸A
	public void visitConcreteElementA(ConcreteElementA elementA);
	
	
	//����Ԫ��B
	public void visitConcreteElementB(ConcreteElementB elementB);
	
}
