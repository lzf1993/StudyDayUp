package designpatten.visitor_24.test1;

import designpatten.visitor_24.test1.impl.EnterpriseCustomer;
import designpatten.visitor_24.test1.impl.PersonalCustomer;

//�����߽ӿ�
public interface Visitor {
	
	//������ҵ�û����൱�ڸ���ҵ�û���ӷ����߹���
	public void visitEnterpriseCustomer(EnterpriseCustomer ec);
	
	
	//���ʸ����û����൱�ڸ������û���ӷ����߹���
	public void visitPersonalCustomer(PersonalCustomer ec);
	

}
