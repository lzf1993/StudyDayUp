package designpatten.prototype_8.java;


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


	//使用java克隆方式
	@Override
	public OrderApi cloneOrder() {
		PersonOrder obj = null;
		try {
			obj = (PersonOrder) super.clone();
			obj.setProduct((Product) product.clone());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}

}
