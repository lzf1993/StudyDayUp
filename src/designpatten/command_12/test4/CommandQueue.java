package designpatten.command_12.test4;

import java.util.ArrayList;
import java.util.List;

import designpatten.command_12.test4.bean.FoodType;
import designpatten.command_12.test4.impl.MenuCommand;



//�������
public class CommandQueue {

	//�������  -- ����˵����� 
	private static List<Command> hotCmds = new ArrayList<>();
	private static List<Command> coolCmds = new ArrayList<>();



	/**
	 * �����ж���˵�����
	 * ��Ӳ˵�  -- 
	 * @param menu �˵�  -- ����Ȳ�
	 */
	public synchronized static void addMenu(MenuCommand menu){
			
		for(Command cmd : menu.getCommands()){
			if(cmd.getFood().getType() == FoodType.HOT){
				hotCmds.add(cmd);
			}else if(cmd.getFood().getType() == FoodType.COOL){
				coolCmds.add(cmd);
			}
		}	 
		
	}


	


	/**
	 *  ��ȡһ���� : �Ȳ� 
	 */
	public synchronized static Command getHotOneCommand(){
        Command cmd = null;
        if(hotCmds.size()>0){
        	cmd = hotCmds.get(0);
        	hotCmds.remove(0);
        }
        return cmd;
	}


	

	/**
	 *  ��ȡһ���� : ���� 
	 */
	public synchronized static Command getCoolOneCommand(){
        Command cmd = null;
        if(coolCmds.size()>0){
        	cmd = coolCmds.get(0);
        	coolCmds.remove(0);
        }
        return cmd;
	}



}
