package designpatten.memento_18.test4.impl;


//��������
public class SubCommand extends AbstractCommand{

	private int num = 0;
	
	public SubCommand(int num){
		this.num = num;
	}
	
	
	//ִ������
	@Override
	public void execute() {
		System.out.println("����"+num);
		this.operationApi.substract(num);
	}

}
