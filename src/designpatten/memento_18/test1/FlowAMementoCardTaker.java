package designpatten.memento_18.test1;


//���𱣴�ģ������A�Ķ���ı���¼����
public class FlowAMementoCardTaker {

	//��¼�ı���¼����
	private FlowAMockMemento memento = null;
	
	
	//���汸��¼����
	public void saveMemento(FlowAMockMemento memento){
		this.memento = memento;
	}
	
	
	//��ȡ����¼����
	public FlowAMockMemento retriveMemento(){
		return this.memento;
	}
	
}
