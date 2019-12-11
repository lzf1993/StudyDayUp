package designpatten.strategy_16.test1.better.impl;

import designpatten.strategy_16.test1.better.Strategy;

public class OldCustomerStrategy implements Strategy{

	@Override
	public double calcPrice(double goodsPrice) {
		System.out.println("�����Ͽͻ���ͳһ�ۿ�5%");
		return goodsPrice*(1-0.05);
	}

}
