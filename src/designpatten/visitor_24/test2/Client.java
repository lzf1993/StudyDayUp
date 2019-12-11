package designpatten.visitor_24.test2;

import designpatten.visitor_24.test2.impl.Composite;
import designpatten.visitor_24.test2.impl.Leaf;
import designpatten.visitor_24.test2.visitorimpl.PrintNameVisitor;

public class Client {

	
	public static void main(String ags[]){
		//�������е���϶���
		Component root = new Composite("��װ");
		Component c1 = new Composite("��װ");
		Component c2 = new Composite("Ůװ");
		
		
		//����Ҷ�Ӷ���
		Component leaf1 = new Leaf("����");
		Component leaf2 = new Leaf("�п�");
		Component leaf3 = new Leaf("ȹ��");
		Component leaf4 = new Leaf("��װ");
		
		//��϶���
		root.addChild(c1);
		root.addChild(c2);
		
		c1.addChild(leaf1);
		c1.addChild(leaf2);
		
		c2.addChild(leaf3);
		c2.addChild(leaf4);
		
		//����ObjectStructure����
		ObjectStructure os = new ObjectStructure();
		os.setRoot(root);
		
		
		//����ObjectStructure����������
		Visitor cVisitor = new PrintNameVisitor();
		os.handleRequest(cVisitor);
		
	}
}
