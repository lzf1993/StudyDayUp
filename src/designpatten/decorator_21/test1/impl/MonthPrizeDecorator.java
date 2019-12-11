package designpatten.decorator_21.test1.impl;

import java.util.Date;

import designpatten.decorator_21.example.TempDB;
import designpatten.decorator_21.test1.Component;
import designpatten.decorator_21.test1.Decorator;


//װ�������� �����㵱��ҵ�񽱽�
public class MonthPrizeDecorator extends Decorator{

	public MonthPrizeDecorator(Component c) {
		super(c);
	}

	@Override
	public double calcPrize(String user, Date begin, Date end) {
		
		//1���Ȼ�ȡǰ����������Ľ���
		double money = super.calcPrize(user, begin, end);
		//2��Ȼ����㵱��ҵ�񽱽𣬰���Ա��ʱ���ȡ��ǰҵ��Ȼ���ٳ���3%
		double prize = TempDB.mapMonthSaleMoney.get(user)*0.03;
		System.out.println(user+"����ҵ�񽱽�"+prize);
		return money+prize;
	}
	
}
