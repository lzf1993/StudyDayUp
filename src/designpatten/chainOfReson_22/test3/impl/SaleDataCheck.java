package designpatten.chainOfReson_22.test3.impl;

import designpatten.chainOfReson_22.test3.SaleHandler;
import designpatten.chainOfReson_22.test3.SaleModel;


//�������ݼ���ְ�����
public class SaleDataCheck extends SaleHandler{

	@Override
	public boolean sale(String user, String customer, SaleModel saleModel) {
		if(user == null || user.trim().length() ==0){
			System.out.println("�����˲���Ϊ��");
			return false;
		}
		
		if(customer == null || customer.trim().length() == 0){
			System.out.println("�ͻ�����Ϊ��");
			return false;
		}
		
		if(saleModel == null){
			System.out.println("������Ʒ�����ݲ���Ϊ��");
			return false;
		}
		
		if(saleModel.getGoods() == null || saleModel.getGoods().trim().length() ==0){
			System.out.println("������Ʒ����Ϊ��");
			return false;
		}
		
		if(saleModel.getSaleNum() == 0){
			System.out.println("������Ʒ���ݲ���Ϊ0");
			return false;
		}
		
		return this.successor.sale(user, customer, saleModel);
	}
}

