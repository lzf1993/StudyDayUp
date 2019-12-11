package designpatten.chainOfReson_22.test3.impl;

import designpatten.chainOfReson_22.test3.SaleHandler;
import designpatten.chainOfReson_22.test3.SaleModel;

//����Ȩ�޼���ְ�����
public class SaleSecurityCheck extends SaleHandler{

	@Override
	public boolean sale(String user, String customer, SaleModel saleModel) {
        //��һ�㣬Ȩ�޼��ֻ��С���ܹ�ͨ��
		if("С��".equals(user)){
			System.out.println("Ȩ�޼��ͨ������ʼ����������Ϣ");
			return this.successor.sale(user, customer, saleModel);
		}else{
             System.out.println("�Բ���"+user+",��û�б���������Ϣ��Ȩ��");
			return false;
		}
	}

}
