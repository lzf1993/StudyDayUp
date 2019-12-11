package designpatten.proxy_10.dao;

public interface OrderApi {

	
	//��ȡ��Ʒ��������
	 public String getProductName();
	 
	 
	 //���ö��������Ĳ�Ʒ���ƣ�������Ա
	 public void setProductName(String productName, String user);
	 
	 
	 //��ȡ��������
	 public int getOrderNum();
	 
	 
	 //���ö���������������Ա
	 public void setOrderNum(int orderNum, String user);
	 
	 
	 //��ȡ������Ա
	 public String getOrderUser();
	 
	 
	 //���ô���������Ա��������Ա
	 public void setOrderUser(String orderUser, String user);
	 
}
