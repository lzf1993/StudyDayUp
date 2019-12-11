package designpatten.memento_18.test3;


//ԭ����
public class FlowAMock {

	//���
	private int result;


	//����һ
	public void runOnePhase(){
		result = 22;
	}


	//���̶�����ʽ1
	public void scheme1(){
		result = 33;
	}

	//���̶�����ʽ2
	public void scheme2(){
		result = 44;
	}


	//��ȡ����¼�࣬�洢��ǰ��״̬
	public FlowAMockMemento createMemento(){
		return new FlowAMockImpl(result);
	}

	
	
	//���ñ���¼�࣬���лָ�
	public void setMemento(FlowAMockMemento memento){
		FlowAMockImpl memento1 = (FlowAMockImpl) memento;
		result = memento1.result;
	}
	


	//����¼��
	private static class FlowAMockImpl implements FlowAMockMemento{
		private int result;
		public FlowAMockImpl(int result){
			this.result = result;
		}
	}
}
