package designpatten.command_12.test3.impl2;

import java.util.ArrayList;
import java.util.Collection;

public class MenuCommand implements Command{
	
	//��Ĳ˼���
	private Collection<Command> col = new ArrayList<Command>();
	
	
	//�û����
	public void add(Command command){
		col.add(command);
	}
	

	//ִ�вˣ���ʵ����ִ��ѭ��
	@Override
	public void execute() {
		for(Command  cmd : col){
			cmd.execute();
		}
	}

}
