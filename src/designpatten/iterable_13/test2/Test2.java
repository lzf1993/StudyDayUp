package designpatten.iterable_13.test2;

import java.util.Collection;
import java.util.Iterator;

public class Test2 {

	
	public static void main(String agrs[]){
	  SalaryManger manger = new SalaryManger();
	  manger.calcPay();
	  
	  
	  AggregationIterator iterator = manger.createIterator();
	  
	  
	  System.out.println("��ʼ��ȡ����");
	  
	  Collection col = iterator.next(2);	  
	  System.out.println("��һҳ����:");
	  print(col);
	
	  Collection col2 = iterator.next(4);	  
	  System.out.println("����ҳ����:");
	  print(col2);
	  
	  
	  Collection col3 = iterator.privious(1);	  
	  System.out.println("����ҳ����:");
	  print(col3);
	}
	
	
	
	public static void print(Collection col){
		Iterator iterator = col.iterator();
		while(iterator.hasNext()){
			Object obj = iterator.next();
			System.out.println(obj);
		}
		
	}
	
}
