package designpatten.composite_14.test1;


//��϶��������
public abstract class Component {
	
	
	public abstract void printStruct(String str);
	
	
	
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
