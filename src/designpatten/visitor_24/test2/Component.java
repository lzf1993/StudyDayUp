package designpatten.visitor_24.test2;


//�������������൱�ڷ�����ģʽ��Ԫ�ض���
public abstract class Component {

	//���շ����ߵķ���
	public abstract void accept(Visitor visitor);
	
	
	//����϶���������������
	public void addChild(Component child){
		throw new UnsupportedOperationException("����֧���������");
	}
	
	
	public void removeChild(Component child){
		throw new UnsupportedOperationException("����֧���������");
	}
	
	
	public Component getChildren(int index){
		throw new UnsupportedOperationException("����֧���������");
	}
}
