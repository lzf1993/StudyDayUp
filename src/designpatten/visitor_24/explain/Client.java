package designpatten.visitor_24.explain;

import designpatten.visitor_24.explain.impl.ConcreteElementA;
import designpatten.visitor_24.explain.impl.ConcreteElementB;

public class Client {

	public static void main(String args[]){
		
		//���� ObjectStructure
		ObjectStructure os = new ObjectStructure();
		
		//����Ҫ�������ṹ��Ԫ��
		Element eleA = new ConcreteElementA();
		Element eleB = new ConcreteElementB();
		
		//��Ԫ�ؼ��뵽����ṹ
	    os.addElement(eleA);
	    os.addElement(eleB);
	    
	    //����������
	    Visitor visitor = new ConcreteVisitor1();
	    os.handleRequest(visitor);
		
		
	}
}
