package designpatten.command_12.test3.impl2;

import designpatten.command_12.test3.impl.CookApi;
import designpatten.command_12.test3.impl.CoolCook;
import designpatten.command_12.test3.impl.HotCook;

//����
public class CoolCommand implements Command{

	//�˵�����
	private String name; 
	//���г�ʦ -- ���˳�ʦ -- ������
	private CoolCook cookApi; 
	
	
	public CoolCommand(String name){
		this.name = name;
	} 
	
	
	public String getName(){
		return name;
	}
	
	
	public void setCookApi(CoolCook cookApi){
		this.cookApi = cookApi;
	}
	
	
	@Override
	public void execute() {
		cookApi.cook(name);
	}

}
