package designpatten.memento_18.test1;

public class Client {

	public static void main(String agrs[]){
		
		//����ģ���������̵Ķ���
		FlowAMock mock = new FlowAMock("TestFlow");
		
		//��ʼ�������̵ĵ�һ���׶�
		mock.runPhaseOne();
		
		//����һ��������
		FlowAMementoCardTaker cardTaker = new FlowAMementoCardTaker();
		
		//������ʱ����ı���¼���󣬲������ڹ����߶������棬����Ҫ�õ�
		FlowAMockMemento memento = mock.createMemento();
		cardTaker.saveMemento(memento);
		
		
		//��װ����1�������̵ĺ�벿��
		mock.schema1();
		
		
		//�ӹ����߻�ȡ����¼���󣬲����û�ȥ����ģ���������̵Ķ���ָ����Լ����ڲ�״̬
		mock.setMemento(cardTaker.retriveMemento());
		
		//���շ���2�������̺�벿��
		mock.schema2();
	}
}
