package designpatten.command_12.test3;

import designpatten.command_12.test3.impl.CoolCook;
import designpatten.command_12.test3.impl.HotCook;
import designpatten.command_12.test3.impl2.Command;
import designpatten.command_12.test3.impl2.CoolCommand;
import designpatten.command_12.test3.impl2.MenuCommand;
import designpatten.command_12.test3.impl2.ShopCommand;

//����Ա
public class Waiter {
	
	private String name;
	
	//���в˵�
	private MenuCommand menuCommand = new MenuCommand();
	
	
	public Waiter(String name){
		this.name = name;
	}
	
	
	//�û����
	public void orderDish(Command cmd){
		//��ʦ
		HotCook hootCook = new HotCook();
		CoolCook colCook = new CoolCook();
		
		//����
		if(cmd instanceof CoolCommand){
			CoolCommand c1 = (CoolCommand) cmd;
			System.out.println("�˿͵����ˣ� "+c1.getName());
			c1.setCookApi(colCook);
		}
		//�Ȳ�
		else if(cmd instanceof ShopCommand){
			ShopCommand c2 = (ShopCommand) cmd;
			System.out.println("�˿͵��Ȳˣ� "+c2.getName());
			c2.setCookApi(hootCook);
			
		}
		menuCommand.add(cmd);
		
	}

	
	//�˵����ˣ���ʼִ�������ʼ����
	public void orderOver(){
		System.out.println("\n�����ɣ���ʼ�������....\n");
		menuCommand.execute();
	}
	
	
}
