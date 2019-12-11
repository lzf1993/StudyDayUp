package designpatten.strategy_16.test2.impl;

import designpatten.strategy_16.test2.PaymentContext;
import designpatten.strategy_16.test2.PaymentStrategy;

//������ֽ�֧��
public class RMBCash implements PaymentStrategy{

	@Override
	public void pay(PaymentContext ctx) {
		System.out.println("���ڸ�"+ctx.getName()+"������ֽ�֧����"+ctx.getMoney()+"Ԫ");
	}
	
}
