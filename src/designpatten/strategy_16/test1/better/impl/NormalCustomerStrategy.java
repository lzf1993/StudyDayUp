package designpatten.strategy_16.test1.better.impl;

import designpatten.strategy_16.test1.better.Strategy;

public class NormalCustomerStrategy implements Strategy{

	@Override
	public double calcPrice(double goodsPrice) {
		System.out.println("������ͨ�û���û���ۿ�");
		return goodsPrice;
	}


}
