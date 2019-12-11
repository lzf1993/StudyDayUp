package designpatten.prototype_8.java;

/**
 * 订单接口
 */
public interface OrderApi extends Cloneable{
	
	public int getOrderProductNum();

	public void setOrderProductNum(int num);

	//克隆订单
	public OrderApi cloneOrder();

}
