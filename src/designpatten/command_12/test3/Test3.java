package designpatten.command_12.test3;

import designpatten.command_12.test3.impl2.Command;
import designpatten.command_12.test3.impl2.CoolCommand;
import designpatten.command_12.test3.impl2.ShopCommand;

public class Test3 {

	 public static void main(String args[]){
		 
		 //��������Ա  -- invoker
		 Waiter waiter = new Waiter("һ�ŷ���Ա");
		 
		 //������  -- �������
		 Command shop1 = new ShopCommand("���ն���");
		 Command shop2 = new ShopCommand("С����");
		 Command shop3 = new ShopCommand("������");
		 //����
		 Command cook1 = new CoolCommand("Ƥ������");
		 
		 
		 //���
		 waiter.orderDish(shop1);
		 waiter.orderDish(shop2);
		 waiter.orderDish(shop3);
		 waiter.orderDish(cook1);
		 
		 
		 //�����ɣ���ʼִ������
		 waiter.orderOver();
	 }
}
