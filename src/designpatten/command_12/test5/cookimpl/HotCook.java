package designpatten.command_12.test5.cookimpl;


import designpatten.command_12.test5.Command;
import designpatten.command_12.test5.CommandQueue;

//�Ȳ˳�ʦ
public class HotCook extends BaseCook{

	
	public HotCook(int num, String name) {
		super(num, name);
	}
	
		
    //��ȡ����
	@Override
	public Command getOneCommand() {
		return CommandQueue.getOneHotCommand();
	}

	
}
