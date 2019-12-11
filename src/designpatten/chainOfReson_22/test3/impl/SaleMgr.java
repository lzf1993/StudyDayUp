package designpatten.chainOfReson_22.test3.impl;

import designpatten.chainOfReson_22.test3.SaleHandler;
import designpatten.chainOfReson_22.test3.SaleModel;

//������������ҵ���ܵ�ְ�����
public class SaleMgr extends SaleHandler{

	@Override
	public boolean sale(String user, String customer, SaleModel saleModel) {
		
		
		//����������ҵ���߼�����
		System.out.println(user+"������"+customer+"����"+saleModel+"����������");
		
		
		return true;
	}

}
