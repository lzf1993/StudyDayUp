package designpatten.bulider_7.dao;



//数据体
public class ExportDataModel {

	//产品id
	private String productId;

	//价格
	private double price;

	//销售数量
	private double amount;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}