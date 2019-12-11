package designpatten.chainOfReson_22.test3;

public class SaleModel {
  
	//���۵���Ʒ
	private String goods;
	
	//���۵���Ʒ
	private int saleNum;

	
	public String getGoods() {
		return goods;
	}
	

	public void setGoods(String goods) {
		this.goods = goods;
	}
	

	public int getSaleNum() {
		return saleNum;
	}

	
	public void setSaleNum(int saleNum) {
		this.saleNum = saleNum;
	}


	@Override
	public String toString() {
		return " [goods=" + goods + ", saleNum=" + saleNum + "]";
	}
	
	
}
