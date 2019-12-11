package designpatten.visitor_24.test1.visitorimpl;

import designpatten.visitor_24.test1.Visitor;
import designpatten.visitor_24.test1.impl.EnterpriseCustomer;
import designpatten.visitor_24.test1.impl.PersonalCustomer;


//����ķ����ߣ�ʵ�ֶԿͻ���ֵ����
public class WorthAnalyzerVisitor implements Visitor{

	
	//����ҵ�û���ֵ����
	@Override
	public void visitEnterpriseCustomer(EnterpriseCustomer ec) {
		System.out.println("���ڶ���ҵ�ͻ�"+ec.getName()+"���м�ֵ����");
	}

	//�Ը����û���ֵ����
	@Override
	public void visitPersonalCustomer(PersonalCustomer ec) {
		System.out.println("���ڶԸ��˿ͻ�"+ec.getName()+"���м�ֵ����");
	}

}
