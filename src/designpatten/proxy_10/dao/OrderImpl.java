package designpatten.proxy_10.dao;

//ʵ����
public class OrderImpl implements OrderApi{

	//��Ʒ����
	private String productName;
	
	//����������
	private int orderNum;
	
	//������������Ա
	private String orderUser;
	
	
	public OrderImpl(String productName, int orderNum, String orderUser) {
		this.productName = productName;
		this.orderNum = orderNum;
		this.orderUser = orderUser;
	}

	
	@Override
	public String getProductName() {
		return productName;
	}

	@Override
	public void setProductName(String productName, String user) {
		this.productName = productName;
	}

	@Override
	public int getOrderNum() {
		return orderNum;
	}

	@Override
	public void setOrderNum(int orderNum, String user) {
        this.orderNum = orderNum;		
	}

	@Override
	public String getOrderUser() {
		return orderUser;
	}

	@Override
	public void setOrderUser(String orderUser, String user) {
        this.orderUser = orderUser;		
	}

}
