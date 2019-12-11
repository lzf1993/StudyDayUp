package designpatten.composite_14.test2;

import java.util.List;



//���  -- ���Ӹ�����ڵ�
public abstract class Component {

	//�����
	private Component parent = null;
	
	
	public Component getParent(){
		return parent;
	}
	
	public void setParent(Component parent){
		this.parent = parent;
	}
	
	
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
	
	
	
	//��ȡ��������Ӷ���
	public List<Component> getChildren(){
		throw new UnsupportedOperationException("����֧���������");
	}
	
	
	
}
