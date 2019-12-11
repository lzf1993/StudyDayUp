package designpatten.chainOfReson_22.explain;

//����ְ��ӿ�
public abstract class Handler {

	protected Handler successor;
	
	public void setHandler(Handler successor){
		this.successor = successor;
	}
	
	
	//ʾ�⴦������ķ���
	public abstract void handleRequest();
	
}
