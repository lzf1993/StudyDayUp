package designpatten.composite_14.explain;

public abstract class Component {

	public abstract void someOperation();
	
	
	
	//����������
	public void addChild(Component child){
		throw new UnsupportedOperationException("����֧���������");
	}
	
	
	
	//����϶������Ƴ�ĳ���������
	public void removeChild(Component child){
		throw new UnsupportedOperationException("����֧���������");
	}
	
	
	
	//��ȡĳ���������
	public Component getChild(int index){
		throw new UnsupportedOperationException("����֧���������");
	}
	
	
}
