package designpatten.visitor_24.explain;


//�����ʵ�Ԫ�ؽӿ�
public abstract class Element {
  
	/**
	 * ���շ����ߵķ���
	 * @param visitor �����߶���
	 */
	public abstract void accept(Visitor visitor);
	
}
