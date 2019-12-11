package designpatten.command_12.test4.impl;

import designpatten.command_12.test4.Command;
import designpatten.command_12.test4.CookApi;
import designpatten.command_12.test4.bean.Food;

//�������  -- ���ն�����������
public class ChopCommand implements Command{

	//��ʦ  -- ������
	private CookApi cookApi;
	//����
	private Food food;
	//��λ��
	private int tableNum;
	
	
	public ChopCommand(Food food,int tableNum){
		this.food = food;
		this.tableNum = tableNum;
	}
	

	@Override
	public void setCookApi(CookApi cookApi) {
		this.cookApi = cookApi;
	}

	@Override
	public int getTableNum() {
		return tableNum;
	}
	
	
	@Override
	public Food getFood(){
		return food;
	}
	
	
	@Override
	public void execute() {
		this.cookApi.cook(tableNum, food.getName());
	}

}
