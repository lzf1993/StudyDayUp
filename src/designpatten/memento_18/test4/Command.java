package designpatten.memento_18.test4;


//����ӿ�
public interface Command {

	
	//ִ������
	public void execute();
	
	//��������
	public void undo(Memento m);
		
	//��������
	public void redo(Memento m);
	
	
	//����ԭ��������״̬�ı���¼����
	public Memento createMemento();
	
}
