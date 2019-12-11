package designpatten.visitor_24.example;

import java.util.ArrayList;
import java.util.Collection;

import designpatten.visitor_24.example.impl.EnterpriseCustomer;
import designpatten.visitor_24.example.impl.PersonalCustomer;

public class Client {

	
	public static void main(String agrs[]){
		Collection<Customer> col = preparedTestData();
		for(Customer cm:col){
			//����ƫ�÷���
			cm.predilectionAnalyze();
			//���м�ֵ����
			cm.worthAnalyze();
		}
		
		
	}
	
	
	private static Collection<Customer> preparedTestData(){
		Collection<Customer> col = new ArrayList<Customer>();
		
		Customer cm1 = new EnterpriseCustomer();
		cm1.setName("AB����");
		col.add(cm1);
		
		Customer cm2 = new EnterpriseCustomer();
		cm2.setName("CDE����");
		col.add(cm2);
		
		Customer cm3 = new PersonalCustomer();
		cm3.setName("����");
		col.add(cm3);
		
		return col;
	}
	
}
