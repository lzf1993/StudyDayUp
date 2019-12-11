package designpatten.command_12.test5;

import java.util.ArrayList;
import java.util.List;


//����Ա  -- invoker ������
public class Waiter {
	
	
	//�����
	private int num;
	
	//����Ա����
	private String name;
	
	//��˵ļ���
	private List<Command> cmds = new ArrayList<>();
	
    
    public Waiter(String name,int num){
    	this.name = name;
    	this.num = num;
    	System.out.println(num+ "�ŷ���Ա��"+name+" Ϊ�����...");
    }
    
   
    //���
    public void orderDish(Command command){       	
    	cmds.add(command);
    	System.out.println(command.getTableNum()+"�������� "+command.getFood().getName());
    }
    
    
    //������ -- �͵���������Ӧ��Ҳ�и�����
    public void orderOver(){
    	System.out.println(cmds.get(0).getTableNum()+"��������ˣ���ʼ�������\n");
        CommandQueue.addCommand(cmds);
    }
    
}
