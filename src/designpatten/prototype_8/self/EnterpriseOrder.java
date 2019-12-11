package designpatten.prototype_8.self;


public class EnterpriseOrder implements OrderApi{

	private String enterpriseName;
	private String productId;
	private int orderProductNum = 0;
	private Product product;;
	
	@Override
	public int getOrderProductNum() {
		return orderProductNum;
	}

	@Override
	public void setOrderProductNum(int num) {
		this.orderProductNum = num;
	}

	public String getEnterpriseName() {
		return enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Product getProduct() {
		return product;
	}
	

	@Override
	public String toString() {
		return "企业订单 [enterpriseName=" + enterpriseName + ", productId=" + productId + ", orderProductNum="
				+ orderProductNum + "]";
	}



	//实现创建新的原型对象
	@Override
	public OrderApi cloneOrder() {
		//新建一个对象
		EnterpriseOrder order = new EnterpriseOrder();
		//设置属性
		order.setEnterpriseName(this.getEnterpriseName());
		order.setOrderProductNum(this.getOrderProductNum());
		order.setProductId(this.getProductId());
		//引用类型对象，继续使用拷贝
		order.setProduct((Product) getProduct().cloneProduct());
		return order;
	}

}
