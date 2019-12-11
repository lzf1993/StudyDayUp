package designpatten.command_12.test1;



//����
public class Box {

	//�����������
	private Command openCommand;
	
	//���������������
	private Command resetCommand;
	
	
	//���ÿ�������
	public void setOpenCommand(Command openCommand){
		this.openCommand = openCommand;
	}
	
	
	//������������
	public void setResetCommand(Command openCommand){
		this.resetCommand = openCommand;
	}
	
	
	
	public void openButtonPressed(){
		this.openCommand.execute();
	}
	
	
	public void resetButtonPressed(){
		this.resetCommand.execute();
	}
}
