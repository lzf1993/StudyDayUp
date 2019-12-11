package designpatten.decorator_21.test2.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import designpatten.decorator_21.test2.Decorator;
import designpatten.decorator_21.test2.GoodsSaleEbi;
import designpatten.decorator_21.test2.SaleModel;

//ʵ����־��¼
public class LogDecorator extends Decorator{

	public LogDecorator(GoodsSaleEbi ebi) {
		super(ebi);
	}

	@Override
	public boolean sale(String user, String customer, SaleModel saleModel) {
		
		boolean f = this.ebi.sale(user, customer, saleModel);
		//ִ��ҵ��󣬿�ʼ��¼��־
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		System.out.println("��־��¼��"+user+"��"+format.format(new Date())+" ʱ������һ�����ۼ�¼��"
				+ "�ͻ���"+customer+",�����¼�ǣ�"+saleModel);	
		return f;
	}

}
