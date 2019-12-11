package designpatten.strategy_16.test2;



//֧�����ʵ������ģ�ÿ���˹��ʲ�ͬ��֧����ʽ��һ��
public class PaymentContext {

	//֧����Աid
	private int useId;

	//֧����Ա����
	private String name;

	//Ҫ֧���Ľ��
	private double money = 0.0;

	//֧�����ʵĲ���
	private PaymentStrategy strategy;

	public PaymentContext(int useId, String name, double money, PaymentStrategy strategy) {
		super();
		this.useId = useId;
		this.name = name;
		this.money = money;
		this.strategy = strategy;
	}

	public int getUseId() {
		return useId;
	}

	public void setUseId(int useId) {
		this.useId = useId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public PaymentStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(PaymentStrategy strategy) {
		this.strategy = strategy;
	}
	
	
	//���տͻ���ϣ��֧��������֧������
	public void payNow(){
		this.strategy.pay(this);
	}

}
