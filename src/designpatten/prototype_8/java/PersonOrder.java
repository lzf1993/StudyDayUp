package designpatten.prototype_8.java;



//使用java的克隆方式
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


	public void setProduct(Product product) {
		this.product = product;
	}


	public Product getProduct() {
		return product;
	}


	@Override
	public String toString() {
		return "个人订单 [coustomerName=" + coustomerName + ", productId=" + productId + ", orderProductNum="
				+ orderProductNum + "]";
	}


	//使用java克隆方式: 深拷贝，除了拷贝值，还拷贝引用类型的数据
	@Override
	public OrderApi cloneOrder() {
		PersonOrder obj = null;
		try {
			//实现不在new, 通过clone
			obj = (PersonOrder) super.clone();
			obj.setProduct((Product) product.clone());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}


}


