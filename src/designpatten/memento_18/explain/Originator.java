package designpatten.memento_18.explain;


//ԭ��������
public class Originator {
	
	
	//ԭ������״̬
	private String state = "";

	
	//����ԭ���������״̬�ı���¼����
	public Memento createMemento(){
		return new MementoImpl(state);
	}
	
	
	//���÷����������״̬������ص�����¼�����¼��״̬
	public void setMemento(Memento memento){
		MementoImpl impl = (MementoImpl) memento;
		this.state = impl.getState();
	}
	
	
	
	//�����ı���¼����ʵ�ֱ���¼խ�ӿ�
	//ʵ�ֳ�˽�е��ڲ��࣬�����ⲿ�����
	private static class MementoImpl implements Memento{
		//��Ҫ���ֵ�״̬
		private String state = "";
		
		public MementoImpl(String state){
			this.state = state;
		}
		
		public String getState(){
			return state;
		}		
	}
}














