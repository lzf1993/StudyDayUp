package designpatten.visitor_24.test1;

import designpatten.visitor_24.test1.impl.EnterpriseCustomer;
import designpatten.visitor_24.test1.impl.PersonalCustomer;
import designpatten.visitor_24.test1.visitorimpl.PredielectionAnalyzeVisitor;
import designpatten.visitor_24.test1.visitorimpl.ServiceRequestvisiotr;
import designpatten.visitor_24.test1.visitorimpl.WorthAnalyzerVisitor;

public class Client {

	public static void main(String agr[]){
		//��������
		ObjectStructure os = new ObjectStructure();
		
		//׼���������ݣ������ͻ�����
		Customer cm1 = new EnterpriseCustomer();
		cm1.setName("ABC����");
		os.addElement(cm1);
		
		Customer cm2 = new EnterpriseCustomer();
		cm2.setName("CDE����");
		os.addElement(cm2);
		
		Customer cm3 = new PersonalCustomer();
		cm3.setName("����");
		os.addElement(cm3);
		
		
		//�ͻ�����������󣬴�����������Visitor
		ServiceRequestvisiotr visitor = new ServiceRequestvisiotr();
		os.handleRequest(visitor);
		
		//Ҫ�Կͻ�����ƫ�÷���������ƫ�÷�����Visitor
		PredielectionAnalyzeVisitor visitor2 = new PredielectionAnalyzeVisitor();
		os.handleRequest(visitor2);
		
		//���ڶԿͻ����м�ֵ����,�����ֵ������Visitor
		WorthAnalyzerVisitor visitor3 = new WorthAnalyzerVisitor();
		os.handleRequest(visitor3);
		
	}
	
}
