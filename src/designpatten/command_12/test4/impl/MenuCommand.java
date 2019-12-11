package designpatten.command_12.test4.impl;

import java.util.ArrayList;
import java.util.Collection;

import designpatten.command_12.test4.Command;
import designpatten.command_12.test4.CommandQueue;
import designpatten.command_12.test4.CookApi;
import designpatten.command_12.test4.bean.Food;


//�˵�
public class MenuCommand implements Command{

	//��Ĳ�
	private Collection<Command> col = new ArrayList<>();
	
	
    //��Ӳ�
	public void addCommand(Command command){
		col.add(command);
	}
	
	
	//��ȡ��
	public Collection<Command> getCommands(){
		return col;
	} 
	
	
	
	//������ˣ����˵�������
	@Override
	public void execute() {
	  CommandQueue.addMenu(this);
	}

	
	
	
	//��Ҫʵ�ֵĹ���
	

	@Override
	public void setCookApi(CookApi cookApi) {
		
	}

	
	@Override
	public int getTableNum() {
		return 0;
	}


	@Override
	public Food getFood() {
		return null;
	}

}
