package designpatten.observer_11.explain;


//�۲��� - ����ʵ����
public class ConcreteObServer implements Observer{

	//�۲��ߵ�״̬
	private String observerState;
	
	
	//Ŀ�����֪ͨ�۲���״̬�ı���
	@Override
	public void update(Subject subject) {
		observerState = ((ConcreteSubject)subject).getSubjectState();  //��ȡĿ������״̬
		System.out.println("�յ����ݣ�Ŀ�����״̬�ı���....."+observerState);
	}

}
