package designpatten.command_12.test5.commandimpl;

import designpatten.command_12.test5.Command;
import designpatten.command_12.test5.CookApi;
import designpatten.command_12.test5.bean.Food;

// �˿ͷ���������  == ���ÿ���˶��൱��һ������
public class ShopCommand implements Command{

	
	//���н����� -- ��ʦ
	private CookApi cookApi;

	//��Ĳ�
	private Food food;
	
	//��λ��
	private int tableNum;
	
	
	public ShopCommand(Food food,int tableNum){
		this.food = food;
		this.tableNum = tableNum;
	}
	
	@Override
	public void excute() {
		cookApi.cook(food.getName(), tableNum);
	}

	

	@Override
	public int getTableNum() {
		return tableNum;
	}



	@Override
	public void setCook(CookApi cookApi) {
		this.cookApi = cookApi;
	}

	
	@Override
	public Food getFood() {
		return food;
	}

}
