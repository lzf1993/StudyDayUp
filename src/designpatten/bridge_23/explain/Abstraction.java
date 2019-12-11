package designpatten.bridge_23.explain;


//���󲿷ֵĽӿ�
public abstract class Abstraction {
 
	
	//����һ��ʵ�ֲ��ֵĶ���
	protected Implementor impl;
		
	public Abstraction(Implementor impl){
		this.impl = impl;
	}
	
	public void operation(){
		impl.operationImpl();
	}
}
