package designpatten.strategy_16.test2.impl;

import designpatten.strategy_16.test2.PaymentContext;
import designpatten.strategy_16.test2.PaymentContext2;
import designpatten.strategy_16.test2.PaymentStrategy;

//���п�֧��
public class CardCash implements PaymentStrategy{

	@Override
	public void pay(PaymentContext ctx) {
       //��Ҫǿ��ת��
		PaymentContext2 ctx2 = (PaymentContext2) ctx;
		System.out.println("���ڸ�"+ctx.getName()+"�� "+ctx2.getAccount()+" �˺�֧���ˣ�"+ctx.getMoney()+"Ԫ");
	}

}
