package designpatten.proxy_10.staticproxy;

import designpatten.proxy_10.dao.OrderApi;
import designpatten.proxy_10.dao.OrderImpl;



//��̬���� -- �����������ʵ��ͬһ������
public class OrderProxy implements OrderApi{

	private OrderImpl order = null;
	
	
	public OrderProxy(OrderImpl order){
		this.order = order;
	}
	
	@Override
	public String getProductName() {
		return order.getProductName();
	}

	@Override
	public void setProductName(String productName, String user) {
		if(user!=null && user.equals(order.getOrderUser())){
			order.setProductName(productName, user);
		}else{
			System.out.println("�Բ�������Ȩ�޸�....");
		}
	}

	@Override
	public int getOrderNum() {
		return order.getOrderNum();
	}

	@Override
	public void setOrderNum(int orderNum, String user) {
		if(user!=null && user.equals(order.getOrderUser())){
			order.setOrderNum(orderNum, user);
		}else{
			System.out.println("�Բ�������Ȩ�޸�....");
		}
	}

	@Override
	public String getOrderUser() {
		return order.getOrderUser();
	}

	
	@Override
	public void setOrderUser(String orderUser, String user) {
		if(user!=null && user.equals(order.getOrderUser())){
			order.setOrderUser(orderUser, user);
		}else{
			System.out.println("�Բ�������Ȩ�޸�....");
		}
	}

}
