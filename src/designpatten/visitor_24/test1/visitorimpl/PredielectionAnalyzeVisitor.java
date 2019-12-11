package designpatten.visitor_24.test1.visitorimpl;

import designpatten.visitor_24.test1.Visitor;
import designpatten.visitor_24.test1.impl.EnterpriseCustomer;
import designpatten.visitor_24.test1.impl.PersonalCustomer;


//�����߾���ʵ�֣����в�Ʒƫ�÷���
public class PredielectionAnalyzeVisitor implements Visitor{

	
	/* 
	 * ����ҵ�û����в�Ʒƫ�÷���
	 * ��Ҫ�û������ݣ����Դ�������
	 */
	@Override
	public void visitEnterpriseCustomer(EnterpriseCustomer ec) {
		System.out.println("���ڶ���ҵ�ͻ�"+ec.getName()+"���в�Ʒƫ�÷��� ");		
	}

	 
	/* 
	 * �Ը����û����в�Ʒƫ�÷���
	 * ��Ҫ�û������ݣ����Դ�������
	 */
	@Override
	public void visitPersonalCustomer(PersonalCustomer ec) {
		System.out.println("���ڶԸ��˿ͻ�"+ec.getName()+"���в�Ʒƫ�÷��� ");				
	} 

}
