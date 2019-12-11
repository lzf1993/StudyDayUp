package designpatten.prototype_8.self;

/**
 * 针对于产品也需要克隆
 */
public class Product implements ProductPrototype{
  
	String productId;
	String name;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 实例化克隆自己的能力
	 * @return
	 */
	@Override
	public ProductPrototype cloneProduct() {
		Product product = new Product();
		product.setName(name);
		product.setProductId(productId);
		return product;
	}
	
}
