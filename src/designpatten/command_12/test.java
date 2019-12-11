package designpatten.command_12;

import designpatten.command_12.test1.Box;
import designpatten.command_12.test1.MainBoardApi;
import designpatten.command_12.test1.impl.GigaMainBoard;
import designpatten.command_12.test1.impl.OpenCommand;
import designpatten.command_12.test1.impl.ResetCommand;
import designpatten.command_12.test2.Calculator;
import designpatten.command_12.test2.OperationApi;
import designpatten.command_12.test2.impl.AddCommand;
import designpatten.command_12.test2.impl.Operation;
import designpatten.command_12.test2.impl.SubstractCommand;

public class test {

	
	public static void main(String args[]){
		
		//���������� -- �������
		OperationApi operation = new Operation();
		
		//��������
		AddCommand addCommand1 = new AddCommand(operation, 5);
		AddCommand addCommand2 = new AddCommand(operation, 15);
		AddCommand addCommand3 = new AddCommand(operation, 6);
		SubstractCommand substractCommand1 = new SubstractCommand(operation, 8);
		SubstractCommand substractCommand2 = new SubstractCommand(operation, 9);
		
		//���������õ������ߣ�Ҳ���Ǽ���������
		Calculator calculator = new Calculator();
		calculator.setAddCmd(addCommand1); //�ӷ�����
		calculator.setSubstractCmd(substractCommand1); //��������
		
		
		//ִ�мӷ� 
		calculator.addPressed();
		System.out.println("\nһ�μӷ������Ľ��Ϊ��"+operation.getResult());
		//ִ�м���
		calculator.substractPressed();
		System.out.println("\nһ�μ��������Ľ��Ϊ��"+operation.getResult());
		
		calculator.undoPressed();
		System.out.println("\n����һ�κ�Ľ��Ϊ��"+operation.getResult());
		
		calculator.undoPressed();
		System.out.println("\n�ٳ���һ�κ�Ľ��Ϊ��"+operation.getResult());
		
		
		calculator.redoPressed();
		System.out.println("\n�ָ�����һ�κ�Ľ��Ϊ��"+operation.getResult());
		
		calculator.redoPressed();
		System.out.println("\n�ٻָ�����һ�κ�Ľ��Ϊ��"+operation.getResult());
		
		
		
	}
	
	
	
	public static void main2(String args[]){
		
		//����
		MainBoardApi api = new GigaMainBoard();
		
		//�������������
		OpenCommand openCommand = new OpenCommand(api);
		ResetCommand resetCommand = new ResetCommand(api);
		
		
		//���䰴ť���ö�Ӧ����
		Box box = new Box();
		box.setOpenCommand(openCommand);
		box.setResetCommand(resetCommand);
		
		//���»��䰴ť
		System.out.println("\n -----------  ���¿������� ------------- \n");
		box.openButtonPressed();
		
		
		System.out.println("\n ----------- ��ʼ���� -------------  \n");
		box.resetButtonPressed();
	}
}
