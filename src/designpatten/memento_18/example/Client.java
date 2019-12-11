package designpatten.memento_18.example;

public class Client {
   public static void main(String args[]){
	   //����ģ���������̵Ķ���
	   FlowAMock mock = new FlowAMock("TestFlow");

	   //�������̵ĵ�һ���׶�
	   mock.runPhaseOne();
	   
	   //�õ���һ�����̵�����,�������Ҫ��
	   int tempResult = mock.getTemResult();
	   String tempState = mock.getTempState();
	   
	   
	   //���з���1
	   mock.schema1();
	   
	   //�ѵ�һ���׶����в����������������û�ȥ
	   mock.setTemResult(tempResult);
	   mock.setTempState(tempState);
	   
	   
	   //���з���2
	   mock.schema2();
   }
}
