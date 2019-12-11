package designpatten.command_12.explain;


//2�����������ʵ�ֶ���  --��ĳ������ķ�װ���п����ж������       -- ĳ������İ�ť
public class ConcreteCommand implements Command{

	
	//������Ӧ�Ľ����߶���   --- ����
	private Receiver receiver = null; 
	
	
	//�������������Լ���״̬
	private String state;
	
	
	public ConcreteCommand(Receiver receiver){
		this.receiver = receiver;
	}
	
	
	@Override
	public void execute() {
		receiver.action();
	}

}
