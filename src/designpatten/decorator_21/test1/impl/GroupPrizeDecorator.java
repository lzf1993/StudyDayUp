package designpatten.decorator_21.test1.impl;

import java.util.Date;

import designpatten.decorator_21.example.TempDB;
import designpatten.decorator_21.test1.Component;
import designpatten.decorator_21.test1.Decorator;

//װ�������� ,���㵱���Ŷ�ҵ�񽱽�
public class GroupPrizeDecorator extends Decorator{
	
	
	public GroupPrizeDecorator(Component c) {
		super(c);
	}
	
	
	@Override
	public double calcPrize(String user, Date begin, Date end) {
		//1���Ȼ�ȡǰ����������Ľ���
		double money = super.calcPrize(user, begin, end);
		//2��Ȼ����㵱���Ŷ�ҵ�񽱽��ȼ�����Ŷ��ܵ�ҵ��Ȼ���ٳ��� 1%
		double group = 0.0;
		for(double d: TempDB.mapMonthSaleMoney.values()){
			group = group+d;
		}
		double prize = group*0.01;
		System.out.println(user+"�����Ŷ�ҵ�񽱽�"+prize);
		return money+prize;
	}

}
