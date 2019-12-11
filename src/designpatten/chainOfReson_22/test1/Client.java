package designpatten.chainOfReson_22.test1;

import designpatten.chainOfReson_22.test1.impl.DepManger;
import designpatten.chainOfReson_22.test1.impl.GeneralManger;
import designpatten.chainOfReson_22.test1.impl.ProjectManger;

public class Client {

	public static void main(String agrs[]){
		Handler h1 = new GeneralManger();
		Handler h2 = new DepManger();
		Handler h3 = new ProjectManger();
		
		//������װ
		h3.setSuccessor(h2); //��Ŀ���� - ���ž��� - �ܾ���
		h2.setSuccessor(h1);
		
        //��ʼ����
		String ret1 = h3.handleFeeRequest("С��", 300);
		System.out.println("ret1 == "+ret1);
		String ret2 = h3.handleFeeRequest("С��", 300);
		System.out.println("ret2 == "+ret2);
		
		String ret3 = h3.handleFeeRequest("С��", 600);
		System.out.println("ret3 == "+ret3);
		String ret4 = h3.handleFeeRequest("С��", 600);
		System.out.println("ret4 == "+ret4);
		
		
		String ret5 = h3.handleFeeRequest("С��", 1300);
		System.out.println("ret5 == "+ret5);
		String ret6 = h3.handleFeeRequest("С��", 1300);
		System.out.println("ret6 == "+ret6);
	}
	
}
