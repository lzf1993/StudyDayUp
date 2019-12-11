package designpatten.strategy_16.test1.better.impl;

import designpatten.strategy_16.test1.better.Strategy;

public class LargeCustomerStrategy implements Strategy{

	@Override
	public double calcPrice(double goodsPrice) {
		System.out.println("���ڴ�ͻ���ͳһ�ۿ�10%");
		return goodsPrice*(1-0.1);
	}
}
