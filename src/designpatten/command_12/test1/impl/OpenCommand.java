package designpatten.command_12.test1.impl;

import designpatten.command_12.test1.Command;
import designpatten.command_12.test1.MainBoardApi;



//�������ʵ����  --- ��������
public class OpenCommand implements Command{

	
	//����
	private MainBoardApi mainBoard = null;
	
	
	//�������� -- �����߶���
	public OpenCommand(MainBoardApi mainBoard){
		this.mainBoard = mainBoard;
	}
	
	
	
	@Override
	public void execute() {
		//����������󣬸�����֪����ο���������������ȥ�������
		mainBoard.open();
	}

}
