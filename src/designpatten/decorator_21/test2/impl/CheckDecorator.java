package designpatten.decorator_21.test2.impl;

import designpatten.decorator_21.test2.Decorator;
import designpatten.decorator_21.test2.GoodsSaleEbi;
import designpatten.decorator_21.test2.SaleModel;


//ʵ��Ȩ�޿���
public class CheckDecorator extends Decorator{


	public CheckDecorator(GoodsSaleEbi ebi) {
		super(ebi);
	}


	@Override
	public boolean sale(String user, String customer, SaleModel saleModel) {

		if(!"����".equals(user)){
			System.out.println("�Բ���"+user+",��û�б������۵���Ȩ��");
			return false;
		}else{
			return this.ebi.sale(user, customer, saleModel);	
		}
	}

}
