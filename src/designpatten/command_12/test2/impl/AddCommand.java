package designpatten.command_12.test2.impl;

import designpatten.command_12.test2.Command;
import designpatten.command_12.test2.OperationApi;

public class AddCommand implements Command{

	private OperationApi operation = null;
	
	private int openNum;
	
	
	public AddCommand(OperationApi operation,int openNum){
		this.operation = operation;
		this.openNum = openNum;
	}
	
	
	//ִ������
	@Override
	public void execute() {
		operation.add(openNum);	
	}

	
	//��������
	@Override
	public void undo() {
		operation.substract(openNum);
	}

}
