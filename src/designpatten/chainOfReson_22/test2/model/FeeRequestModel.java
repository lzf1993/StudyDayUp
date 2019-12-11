package designpatten.chainOfReson_22.test2.model;


//�۲ͷ������
public class FeeRequestModel extends RequestModel{

	public final static String FEE_TYPE = "fee";
	
	//������
	private String user;
	
	//������
	private double fee;
	
	
	public FeeRequestModel() {
		super(FEE_TYPE);
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public double getFee() {
		return fee;
	}


	public void setFee(double fee) {
		this.fee = fee;
	}
	
	

}
