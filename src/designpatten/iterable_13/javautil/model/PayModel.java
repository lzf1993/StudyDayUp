package designpatten.iterable_13.javautil.model;

public class PayModel {

	//�û�����
	private String name;
	
	//֧���Ľ��
	private double pay;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "PayModel [name=" + name + ", pay=" + pay + "]";
	}
	
	

}
