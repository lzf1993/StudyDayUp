package designpatten.command_12.test2.impl;

import designpatten.command_12.test2.Command;
import designpatten.command_12.test2.OperationApi;

public class SubstractCommand implements Command{


	private OperationApi operation = null;
	
	private int openNum;
	
	public SubstractCommand(OperationApi operation,int openNum){
		this.operation = operation;
		this.openNum = openNum;
	}
	
	
	@Override
	public void execute() {
		operation.substract(openNum);
	}
	

	@Override
	public void undo() {
		operation.add(openNum);
	}

}
