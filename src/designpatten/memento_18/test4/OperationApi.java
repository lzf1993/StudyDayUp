package designpatten.memento_18.test4;


//��������Ľӿ�
public interface OperationApi {

	
	//��ȡ������
	public int getResult();
	
	
	//�ӷ�����
	public void add(int num);
	
	
	//��������
	public void substract(int num);
	
	
	//��������¼����
	public Memento createMemento();
	
	
	//���ñ���¼���󣬽���״̬��ԭ
	public void setMemento(Memento memento);
	
}
