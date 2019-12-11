package designpatten.visitor_24.test2.visitorimpl;

import designpatten.visitor_24.test2.Component;
import designpatten.visitor_24.test2.Visitor;
import designpatten.visitor_24.test2.impl.Composite;
import designpatten.visitor_24.test2.impl.Leaf;

//����ķ����ߣ�ʵ�֣������������ƣ�
//����϶��������ǰ����ӡ��ڵ㣺��
//��Ҷ�Ӷ��������ǰ�����ӡ�Ҷ�ӣ��� 
public class PrintNameVisitor implements Visitor{

	private String preStr = "";
	
	@Override
	public void visitComposite(Composite composite) {
		System.out.println("�ڵ㣺"+composite.getName());
//		if(composite.getChildComponents()!=null){
//			preStr = preStr+"";
//			for(Component c: composite.getChildComponents()){
//				c.accept(this);
//			}
//		}
	}

	@Override
	public void visitLeaf(Leaf leaf) {
		System.out.println(" -Ҷ�ӣ�"+leaf.getName());
	} 

}
