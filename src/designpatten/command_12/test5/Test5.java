package designpatten.command_12.test5;

import java.util.ArrayList;
import java.util.List;

import designpatten.command_12.test5.bean.Food;
import designpatten.command_12.test5.bean.FoodType;
import designpatten.command_12.test5.commandimpl.ShopCommand;



public class Test5 {
	
	public static List<Food> initFoods(){
		List<Food> foods = new ArrayList<>();
		//�Ȳ�
		foods.add(new Food("���ն���",10,FoodType.HOT));
		foods.add(new Food("������",10,FoodType.HOT));
		foods.add(new Food("С����",10,FoodType.HOT));
		foods.add(new Food("�⽷����",10,FoodType.HOT));
		foods.add(new Food("���ȼ���",10,FoodType.HOT));
		foods.add(new Food("С������",10,FoodType.HOT));
		foods.add(new Food("��˿��",10,FoodType.HOT));
		//����
		foods.add(new Food("Ƥ������",10,FoodType.COOL));
		foods.add(new Food("������",10,FoodType.COOL));
		foods.add(new Food("�ƹ�",10,FoodType.COOL));
		foods.add(new Food("������",10,FoodType.COOL));
		foods.add(new Food("������",10,FoodType.COOL));
		return foods;
	}
	
	
	public static void main(String args[]){
		//����ϰ���
		CookManger.startWork();
		

		List<Food> foods  = initFoods();
		
		
		//ģ��������ͬʱ���
		for(int i=1;i<=6;i++){

			Waiter waiter = new Waiter("����Ա"+i+"��", i);

			ShopCommand command1 = new ShopCommand(foods.get(2), i);
			ShopCommand command2 = new ShopCommand(foods.get(3), i);
			ShopCommand command3 = new ShopCommand(foods.get(4), i);
			ShopCommand command4 = new ShopCommand(foods.get(10), i);
			
			//���
			waiter.orderDish(command1);
			waiter.orderDish(command2);
			waiter.orderDish(command3);
			waiter.orderDish(command4);
			
			//������
			waiter.orderOver();
		}

		
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//ģ��������ͬʱ���
		for(int i=1;i<=6;i++){

			Waiter waiter = new Waiter("����Ա"+i+"��", i);

			ShopCommand command1 = new ShopCommand(foods.get(1), i);
			ShopCommand command2 = new ShopCommand(foods.get(5), i);
			ShopCommand command3 = new ShopCommand(foods.get(7), i);
			ShopCommand command4 = new ShopCommand(foods.get(11), i);
			
			//���
			waiter.orderDish(command1);
			waiter.orderDish(command2);
			waiter.orderDish(command3);
			waiter.orderDish(command4);
			
			//������
			waiter.orderOver();
		}
		
	}

}
