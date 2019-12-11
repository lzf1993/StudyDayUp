package designpatten.chainOfReson_22.test3.impl;

import designpatten.chainOfReson_22.test3.SaleHandler;
import designpatten.chainOfReson_22.test3.SaleModel;

//���������߼�����ְ�����
public class SaleLogicCheck extends SaleHandler{

	@Override
	public boolean sale(String user, String customer, SaleModel saleModel) {
		
		//�������ݵ��߼���飬������ID��Ψһ�ԣ�������Ķ�Ӧ��ϵ
		//Ϊ����ʾ�򵥣�ֱ��ͨ��
		
		System.out.println("��Ʒ����У��ͨ��...");
		
		
		//���ͨ����飬���������ִ��
		return this.successor.sale(user, customer, saleModel);
	}

}
