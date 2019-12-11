package designpatten.memento_18.explain;


//���𱣴汸��¼�Ķ���
public class Caretaker {
   
	//��¼������ı���¼����
	private Memento memento = null;
	
	
	//���汸��¼����
	public void saveMemento(Memento memento){
		this.memento = memento;
	}
	
	
	//��ȡ����ı���¼����
	public Memento retriveMemento(){
		return this.memento;
	}
	
	
}
