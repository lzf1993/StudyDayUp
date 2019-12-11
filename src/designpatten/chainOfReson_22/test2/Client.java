package designpatten.chainOfReson_22.test2;

import designpatten.chainOfReson_22.test2.impl2.DepManger2;
import designpatten.chainOfReson_22.test2.impl2.GeneralManger2;
import designpatten.chainOfReson_22.test2.impl2.ProjectManger2;
import designpatten.chainOfReson_22.test2.model.FeeRequestModel;
import designpatten.chainOfReson_22.test2.model.PreFeeRequestModel;

public class Client {

	public static void main(String args[]){
		
		//����۲ͷ�������
		Handler h1 = new ProjectManger2();
		Handler h2 = new DepManger2();
		Handler h3 = new GeneralManger2();
		//��װ������
		h1.setHandler(h2);
		h2.setHandler(h3);
		
		
		//1����ʼ��������۲ͷ���
		FeeRequestModel fm = new FeeRequestModel();
		fm.setFee(600);
		fm.setUser("С��");
		//���ô���
		String ret1 = (String) h1.handleRequest(fm);
		System.out.println("ret1 = "+ret1);
		
		
		//2����ʼ��������Ԥ֧���÷���
		PreFeeRequestModel model = new PreFeeRequestModel();
		model.setFee(3000);
		model.setUser("С��");
		//���ô���
		String ret2 = (String) h1.handleRequest(model);
		System.out.println("ret2 = "+ret2);
		
	}
}
