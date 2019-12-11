package designpatten.command_12.test4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import designpatten.command_12.test4.bean.Food;
import designpatten.command_12.test4.bean.FoodType;
import designpatten.command_12.test4.impl.ChopCommand;

public class Test4 {
	
	
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
		return foods;
	}
	


	public static void main(String args[]){

		//��ʦ��ʼ����
		CookManger.runCookManger();


		List<Food> foods  = initFoods();
		
		
		//ģ��������ͬʱ���
		for(int i=1;i<=6;i++){

			Waiter waiter = new Waiter("����Ա"+i+"��");

			ChopCommand command1 = new ChopCommand(foods.get(2), i);
			ChopCommand command2 = new ChopCommand(foods.get(3), i);
			ChopCommand command3 = new ChopCommand(foods.get(4), i);
			ChopCommand command4 = new ChopCommand(foods.get(6), i);
			
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
