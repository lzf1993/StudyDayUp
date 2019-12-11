package designpatten.chainOfReson_22.test3;

import designpatten.chainOfReson_22.test3.impl.SaleDataCheck;
import designpatten.chainOfReson_22.test3.impl.SaleLogicCheck;
import designpatten.chainOfReson_22.test3.impl.SaleMgr;
import designpatten.chainOfReson_22.test3.impl.SaleSecurityCheck;

//��Ʒ���۹���ģ���ҵ����
public class GoodsSaleEbo {
	
	
	
	/**
	 * ����������Ϣ
	 * @param user         ������Ա
	 * @param customer     �ͻ�
	 * @param saleModel    ��������
	 * @return         �Ƿ���ɹ�
	 */
	public boolean sale(String user,String customer, SaleModel saleModel){
		
		//���ȫ������������˳���ǣ�
		//1��Ȩ�޼��
		//2��ͨ�����ݼ�飨�п����ڱ��ֲ��Ѿ������ˣ�
		//3�������߼�У��
		//4��������ҵ����
		
		//����ͨ��������������������Ҫ���𹹽���
		SaleSecurityCheck ssc = new SaleSecurityCheck();
		SaleDataCheck sdc = new SaleDataCheck();
		SaleLogicCheck slc = new SaleLogicCheck();
		SaleMgr sd = new SaleMgr();
		//��װ������
		ssc.setSuccessor(sdc);
		sdc.setSuccessor(slc);
		slc.setSuccessor(sd);
		//���ϵĵ�һ�����󷢳����������
		
		return ssc.sale(user, customer, saleModel);
	}

}
