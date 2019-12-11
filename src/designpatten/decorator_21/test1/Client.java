package designpatten.decorator_21.test1;

import designpatten.decorator_21.test1.impl.GroupPrizeDecorator;
import designpatten.decorator_21.test1.impl.MonthPrizeDecorator;
import designpatten.decorator_21.test1.impl.SumPrizeDecorator;

public class Client {

	
	public static void main(String args[]){
		//1���ȴ����������������࣬Ҳ���Ǳ�װ�ε���
		Component c1 = new ConcreteComponent();
		
		//2��Ȼ��Լ���Ļ����������װ�Σ�����Ҫ��ϸ���װ��
		//˵��������װ��֮�����Ҫ���Ⱥ�˳�������
		//Ҳ������װ��˭�ͺ�װ��˭Ӧ����һ����
		
		
		//�������ͨҵ����Ա�Ľ������
		Decorator d1 = new MonthPrizeDecorator(c1);  //����ҵ�񽱽�
		Decorator d2 = new SumPrizeDecorator(d1);    //�ۼ�ҵ�񽱽�
		
		double zs = d2.calcPrize("����", null, null);
		System.out.println("=============����Ӧ�ý���"+zs);
		
		
		double ls = d2.calcPrize("����", null, null);
		System.out.println("=============����Ӧ�ý���"+ls);
		
		
		//�����ҵ��������Ҫ�����ŶӵĽ������
		Decorator d3 = new GroupPrizeDecorator(d2);    //�ۼ�ҵ�񽱽�
		double ww = d3.calcPrize("����", null, null);
		System.out.println("============������Ӧ�ý���"+ww);
		
	}
}
