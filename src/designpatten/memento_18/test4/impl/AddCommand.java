package designpatten.memento_18.test4.impl;


//�ӷ�����
public class AddCommand extends AbstractCommand{
   
	//�ӵ�����
	private int num;
	
	public AddCommand(int num){
		this.num = num;
	}
	
	
	//���ý�����ִ�мӷ�����
	@Override
	public void execute() {
		System.out.println("�ӣ�"+num);
       this.operationApi.add(num);		
	}


	
}
