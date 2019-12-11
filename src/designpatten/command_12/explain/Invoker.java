package designpatten.command_12.explain;



//������  -- ���� --�����������
public class Invoker {

	//�����������
	private Command command = null;
	
	//�����������
	public void setCommand(Command command){
		this.command = command;
	}
	
	
	
	//ʾ�ⷽ����Ҫ������ִ������
	public void runCommand(){
		command.execute();
	}
	
	
	
}
