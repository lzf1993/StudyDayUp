package designpatten.strategy_16.test2;

import designpatten.strategy_16.test2.impl.CardCash;
import designpatten.strategy_16.test2.impl.DollarCash;
import designpatten.strategy_16.test2.impl.RMBCash;
import designpatten.strategy_16.test2.model.UserModel;

public class Test {

	public static void main(String args[]){

		//������Ӧ��֧������
		PaymentStrategy strategyRMB = new RMBCash();
		PaymentStrategy strategyDollar = new DollarCash();
		PaymentStrategy strategyCard= new CardCash();



		//֧�����ʵ���Ա��
		UserModel model1 = new UserModel("����", 22, 1);
		UserModel model2 = new UserModel("����", 23, 1);
		UserModel model3 = new UserModel("����", 21, 1);


		//������֧������ -- ������ֽ�֧��
		PaymentContext ct1 = new PaymentContext(model1.getUseId(), model1.getName(), 10000, strategyRMB);
		ct1.payNow();

		//������֧������ -- ��Ԫ�ֽ�֧��
		PaymentContext ct2 = new PaymentContext(model2.getUseId(), model2.getName(), 7000, strategyDollar);
		ct2.payNow();


		//������֧������ -- ���п�֧��
		PaymentContext2 ct3 = new PaymentContext2(model3.getUseId(), model3.getName(),9000, strategyCard,"11119880080");
		ct3.payNow();

	}
}
