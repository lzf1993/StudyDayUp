package designpatten.prototype_8.self;


public class PersonOrder implements OrderApi{
	private String coustomerName;
	private String productId;
	private int orderProductNum = 0;
	private Product product;

	public String getCoustomerName() {
		return coustomerName;
	}

	public void setCoustomerName(String coustomerName) {
		this.coustomerName = coustomerName;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	@Override
	public int getOrderProductNum() {
		return orderProductNum;
	}

	@Override
	public void setOrderProductNum(int num) {
         this.orderProductNum = num;		
	}
	
	public Product getProduct() {
		return product;
	}
		
	public void setProduct(Product product) {
		this.product = product;
	}
	

	@Override
	public String toString() {
		return "个人订单 [coustomerName=" + coustomerName + ", productId=" + productId + ", orderProductNum="
				+ orderProductNum + "]";
	}



	//实现创建新的原型对象
	@Override
	public OrderApi cloneOrder() {
		//新建一个对象
		PersonOrder order = new PersonOrder();
		//设置属性
		order.setCoustomerName(this.getCoustomerName());
		order.setOrderProductNum(this.getOrderProductNum());
		//引用类型对象，继续使用拷贝
		order.setProduct((Product) getProduct().cloneProduct());
		order.setProductId(this.getProductId());
		return order;
	}

	
}


