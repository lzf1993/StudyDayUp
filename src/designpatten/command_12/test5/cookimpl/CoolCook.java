package designpatten.command_12.test5.cookimpl;


import designpatten.command_12.test5.Command;
import designpatten.command_12.test5.CommandQueue;

//���˳�ʦ
public class CoolCook extends BaseCook{
	
	
	public CoolCook(int num, String name) {
		super(num, name);
	}
	
	
	
    //��ȡ����
	@Override
	public Command getOneCommand() {
		return CommandQueue.getOneCoolCommand();
	}

	
}
