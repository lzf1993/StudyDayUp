package designpatten.command_12.test4;

import designpatten.command_12.test4.impl.MenuCommand;

//����Ա
public class Waiter {

	//����Ա����
	private String name;
	//�˵�
	private MenuCommand menuCommand = new MenuCommand();	

	public Waiter(String name){
		this.name = name;
	}


	//���
	public void orderDish(Command cmd){
		menuCommand.addCommand(cmd);
	}



	//������ �� ��ʼ�Ѳ˵��͵�
	public void orderOver(){
		menuCommand.execute();
	}


}
