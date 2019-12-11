package designpatten.strategy_16.test1.better;

import designpatten.strategy_16.test1.better.impl.LargeCustomerStrategy;
import designpatten.strategy_16.test1.better.impl.NormalCustomerStrategy;

public class Test {

	
	public static void main(String agrs[]){
        
		//ѡ����Զ���
		Strategy strategy = new NormalCustomerStrategy();
		//����������
		Price ctx  = new Price(strategy);
		//���㱨��
		double quote = ctx.quote(1000);
		
		System.out.println("�ͻ��˱��ۣ�"+quote);
		
	}
}
