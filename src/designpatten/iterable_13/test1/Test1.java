package designpatten.iterable_13.test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import designpatten.iterable_13.test1.model.PayModel;

public class Test1 {

	
	public static void main(String args[]){
		
		//A��˾
		PayMangerA mangerA = new PayMangerA();
		//���㹤��
		mangerA.calcPay();
		System.out.println("��˾A�Ĺ����б�");
		test(mangerA.createIterator());
		
		
		//B��˾
		PayMangerB mangerB = new PayMangerB();
		//���㹤��
		mangerB.calcPay();
		System.out.println("��˾B�Ĺ����б�");
		test(mangerB.createIterator());
		
		
		
		//ʹ��java 1.5������ ��ǿforѭ��
		System.out.println("\n -- ʹ����ǿforѭ����-- \n");
		System.out.println("��˾A�Ĺ����б�");
		
		List<PayModel> modesl = mangerA.getPayList();
		for(PayModel model:modesl ){
			System.out.println("the obj == "+model);
		}
		
		System.out.println("\n��˾B�Ĺ����б�");
		
		PayModel[] modes2 = mangerB.getPays();
		for(PayModel mode2:modes2 ){
			System.out.println("the obj == "+mode2);
		}
		
	}
	
	
	//ʹ�õ��������з���
	public static void test(Iterator it){		
		it.first();
		while(!it.isDone()){
			Object object = it.currentItem();
			System.out.println("the obj == "+object);
			it.next();
		}
		System.out.println();
	}
	
	
	
	
}
