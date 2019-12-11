package designpatten.iterable_13.javautil;


import java.util.Iterator;




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
		
	}
	
	
	//ʹ�õ��������з���
	public static void test(Iterator it){		
		while(it.hasNext()){
			Object object = it.next();
			System.out.println("the obj == "+object);
		}
		System.out.println();
	}
	
	
	
	
}
