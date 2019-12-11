package designpatten.decorator_21.test2;

import designpatten.decorator_21.test2.impl.CheckDecorator;
import designpatten.decorator_21.test2.impl.LogDecorator;

public class Client {

	public static void main(String args[]){
		//�õ�ҵ��ӿڣ����װ����
		GoodsSaleEbi ebi = new CheckDecorator(new LogDecorator(new GoodsSaleEbo()));
		
		SaleModel model = new SaleModel();
		model.setGoods("moto �ֻ�");
		model.setSaleNum(22);
		
		//����ҵ����
		ebi.sale("����", "������", model);
	 	ebi.sale("����", "������", model);
	}
}
