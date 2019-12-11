package designpatten.command_12.test2;

import java.util.ArrayList;
import java.util.List;

//������
public class Calculator {
  
	
	//��¼��ʷ������¼
	private List<Command> undoCmds = new ArrayList<>();
	//��¼�������������ʷ��¼���ָ�ʱ�õ�
	private List<Command> redoCmds = new ArrayList<>();
	
	
	//ִ�мӷ�����
	private Command addCmd = null;
	
	
	//ִ�м���������
	private Command substractCmd = null;
	
	
	
	public void setAddCmd(Command addCmd){
		this.addCmd = addCmd;
	}
	
	public void setSubstractCmd(Command substractCmd){
		this.substractCmd = substractCmd;
	}
	
	
	//�ӷ�����
	public void addPressed(){
		this.addCmd.execute();
		this.undoCmds.add(this.addCmd);
	}
	
	
	//��������
	public void substractPressed(){
		this.substractCmd.execute();
		this.undoCmds.add(this.substractCmd);
	}
	
	
	//��������
	public void undoPressed(){
		if(undoCmds.size()>0){
			Command command = undoCmds.get(undoCmds.size()-1);
			command.undo();
			this.redoCmds.add(command);
			this.undoCmds.remove(command);
		}else{
			System.out.println("��Ǹ��û�пɳ���������...");
		}
	}
	
	
	
	//�ָ�����������
	public void redoPressed(){
		if(redoCmds.size()>0){
			Command command = redoCmds.get(redoCmds.size()-1);
			command.execute();
			this.undoCmds.add(command);
			this.redoCmds.remove(command);
		}else{
			System.out.println("��Ǹ��û�пɻָ�������...");
		}
	}
	
}
