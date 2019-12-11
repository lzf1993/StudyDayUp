package designpatten.chainOfReson_22.test2.model;


//��װ��Ԥ֧���÷�����ҵ����ص���������
public class PreFeeRequestModel extends RequestModel{

	public final static String FEE_TYPE = "preFee";
	
	//������
	private String user;
	
	//������
	private double fee;
	
	public PreFeeRequestModel(){
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
