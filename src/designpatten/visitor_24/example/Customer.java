package designpatten.visitor_24.example;


//���ֿͻ��ĸ���
public abstract class Customer {

	
	//�ͻ����
	private String customerId;
	
	//�ͻ�����
	private String name;
	
	
	//1���ͻ������������ķ���
	public abstract void serviceRequest();

	
	//2���ͻ��Թ�˾��Ʒ��ƫ�÷���
	public abstract void predilectionAnalyze();
	
	
	//3���ͻ���ֵ����
	public abstract void worthAnalyze();

	
	public String getCustomerId() {
		return customerId;
	}


	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
}
