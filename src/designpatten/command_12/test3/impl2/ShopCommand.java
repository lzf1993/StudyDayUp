package designpatten.command_12.test3.impl2;

import designpatten.command_12.test3.impl.CookApi;
import designpatten.command_12.test3.impl.HotCook;

//������� �� �Ȳ�
public class ShopCommand implements Command{

	//�˵�����
	private String name; 
	//���г�ʦ -- �Ȳ˳�ʦ  -- ������
	private HotCook cookApi; 
	
	
	public ShopCommand(String name){
		this.name = name;
	} 
	
	public String getName(){
		return name;
	}
	
	public void setCookApi(HotCook cookApi){
		this.cookApi = cookApi;
	}
	
	
	@Override
	public void execute() {
		cookApi.cook(name);
	}
 
}
