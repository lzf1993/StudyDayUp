package designpatten.state_17.test4;


//����״̬�����
//������������ʹ��״̬ģʽ��Ҫ�Ĺ�������
public class StateMachine {

	//����һ��״̬����
	private State state = null;

	//������Ҫ��ҵ�����ݶ���
	private Object data;
	
	
	public void doWork(){
		this.state.doWork(this);
	}
	
	public void setData(Object data){
		this.data = data;
	}
	
	
	public void setState(State state){
	  this.state = state;	
	}

	public State getState() {
		return state;
	}

	public Object getData() {
		return data;
	}
	
	
}
