package designpatten.command_12.test5;

import java.util.ArrayList;
import java.util.List;

import designpatten.command_12.test5.bean.FoodType;
import designpatten.command_12.test5.util.FileOpenUtil;

// ����ĵ�˶���   -- ������ʱ��ϵͳ��ϵ�
public class CommandQueue {

	private static final String fileName = "command.txt";
	
	//�Ȳ˲˵�
	private static List<Command> hotCmds = new ArrayList<>();
	//���˲˵�
	private static List<Command> coolCmds = new ArrayList<>();

	
	//�ָ�֮ǰ������
	static{
		addCommand(FileOpenUtil.readFile(fileName));
	}
	
	
	
	
	//��Ӳ˵�
	public synchronized static void addCommand(List<Command> cmds){
		if(cmds == null || cmds.size() ==0){
			return;
		}
		for(Command cmd: cmds){
			if(cmd.getFood().getType() == FoodType.COOL){ //����
				coolCmds.add(cmd);
			}else{ //�Ȳ�
				hotCmds.add(cmd);
			}
		}  
	}


	
	//��ȡһ���Ȳ�
	public synchronized static Command getOneHotCommand(){
		if(hotCmds == null || hotCmds.size() ==0){
			return null;
		}
		Command cmd = hotCmds.get(0);
		hotCmds.remove(0);
		FileOpenUtil.writeFile(hotCmds ,coolCmds, fileName);
		return cmd;
	}


	
	//��ȡһ������
	public synchronized static Command getOneCoolCommand(){
		if(coolCmds == null || coolCmds.size() ==0){
			return null;
		}
		Command cmd = coolCmds.get(0);
		coolCmds.remove(0);
		return cmd;
	}


}
