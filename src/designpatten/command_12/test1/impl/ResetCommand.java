package designpatten.command_12.test1.impl;

import designpatten.command_12.test1.Command;
import designpatten.command_12.test1.MainBoardApi;

public class ResetCommand implements Command{

	//����
	private MainBoardApi mainBoard = null;
	
	
	//�������� -- �����߶���
	public ResetCommand(MainBoardApi mainBoard){
		this.mainBoard = mainBoard;
	}
	
	
	//��������
	@Override
	public void execute() {
		mainBoard.reset();
	}
 
}
