package designpatten.strategy_16.test1.better;

public class Price {

	private Strategy strategy = null;
	
	public Price(Strategy strategy){
		this.strategy = strategy;
	}
	
	
	//���㱨��
	public double quote(double goodsPrice){
		return this.strategy.calcPrice(goodsPrice);
	}
	
}
