 package designpatten.decorator_21.test1.impl;

import java.util.Date;

import designpatten.decorator_21.test1.Component;
import designpatten.decorator_21.test1.Decorator;

//װ�������󣬼����ۼƽ���
public class SumPrizeDecorator extends Decorator{

	public SumPrizeDecorator(Component c) {
		super(c);
	}

	
	@Override
	public double calcPrize(String user, Date begin, Date end) {
		
		//1���Ȼ�ȡǰ����������Ľ���
		double money = super.calcPrize(user, begin, end);
		//2��Ȼ������ۼƽ�����ʵӦ������Աȥ��ȡ�ۼƵ�ҵ��Ȼ�ٳ���0.1%
		//�������ʾһ�£��ٶ�����ۼƵ�ҵ���� 100000
		double prize = 100000 * 0.001;
		System.out.println(user+"�ۼƽ���"+prize);
		return money+prize;
		
	}
}
