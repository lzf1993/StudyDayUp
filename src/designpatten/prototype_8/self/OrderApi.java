package designpatten.prototype_8.self;

/**
 * 订单的克隆直接放在该接口里面
 */
public interface OrderApi {
  
	public int getOrderProductNum();
	
	public void setOrderProductNum(int num);

	//克隆订单
	public OrderApi cloneOrder();
	
}
