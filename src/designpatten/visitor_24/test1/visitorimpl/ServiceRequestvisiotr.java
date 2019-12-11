package designpatten.visitor_24.test1.visitorimpl;

import designpatten.visitor_24.test1.Visitor;
import designpatten.visitor_24.test1.impl.EnterpriseCustomer;
import designpatten.visitor_24.test1.impl.PersonalCustomer;

//����ķ����߶���ʵ�֣��ͻ������������Ĺ���
public class ServiceRequestvisiotr implements Visitor{

	//��ҵ�û�����ľ����������
	@Override
	public void visitEnterpriseCustomer(EnterpriseCustomer ec) {
		System.out.println(ec.getName()+"��ҵ�����������");
	}

	
	//�����û�����ľ����������
	@Override
	public void visitPersonalCustomer(PersonalCustomer ec) {
		 System.out.println("�ͻ�"+ec.getName()+"�����������"); 
	}

}
