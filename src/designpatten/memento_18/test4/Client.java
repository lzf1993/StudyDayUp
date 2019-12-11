package designpatten.memento_18.test4;

import designpatten.memento_18.test4.impl.AddCommand;
import designpatten.memento_18.test4.impl.SubCommand;

public class Client {


	public static void main(String agrs[]){
		//1����װ����ͽ�����

		//����������
		OperationApi api = new Operation();

		//��������
		AddCommand addCmd = new AddCommand(6);
		SubCommand substractCommand = new SubCommand(3);

		//��װ����ͽ�����
		addCmd.setOperation(api);
		substractCommand.setOperation(api);

		//���������ó�����
		Calculator calculator = new Calculator();
		calculator.setAddCmd(addCmd);
		calculator.setSubCmd(substractCommand);

		//�ӷ�����
		calculator.addPressed();
		System.out.println("һ�μӷ������������"+api.getResult());
		//��������
		calculator.subPressed();
		System.out.println("һ�μ��������������"+api.getResult());
		
		//һ�γ�������
		calculator.undoPressed();
	    System.out.println("һ�γ��������������"+api.getResult());
	    
	    //�ָ�����
	    calculator.redoPressed();
	    System.out.println("�ָ������Ĳ����������"+api.getResult());

	}
}
