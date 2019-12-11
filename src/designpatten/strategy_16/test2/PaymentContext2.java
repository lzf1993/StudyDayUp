package designpatten.strategy_16.test2;


//��չ��֧�������Ķ���
public class PaymentContext2 extends PaymentContext{


	//���п��˺�
	private String account = null;

	public PaymentContext2(int useId, String name, double money, PaymentStrategy strategy, String account) {
		super(useId, name, money, strategy);
		this.account = account;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

}
