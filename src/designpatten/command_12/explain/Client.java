package designpatten.command_12.explain;

public class Client {

	
	
	public void assemble(){
		//����������
		Receiver receiver = new Receiver();
		
		//������ť
		Command command = new ConcreteCommand(receiver);
		
		//���� --- ��������
		Invoker invoker = new Invoker();
		invoker.setCommand(command);  //231301room
	}
}
