package designpatten.visitor_24.test2;

import designpatten.visitor_24.test2.impl.Composite;
import designpatten.visitor_24.test2.impl.Leaf;

//������϶���ķ����߽ӿ�
public interface Visitor {


	//������϶����൱�ڸ���϶�����ӷ����ߵĹ���
	public void visitComposite(Composite composite);

	//����Ҷ�Ӷ����൱�ڸ�Ҷ�Ӷ�����ӷ����ߵĹ���
	public void visitLeaf(Leaf leaf);

}
