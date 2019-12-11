package designpatten.state_17.explain;



//����ͻ�����Ȥ�Ľӿڣ�ͨ����ά��State���͵Ľ��
public class Context {

	//����״̬�ӿ�
	private State state;
	
	public void setState(State state){
		this.state = state;
	}
	
	
	//�û�����Ȥ�Ľӿ�
	public void request(String para){
		state.handle(para);
	}
	
}
