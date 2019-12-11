package designpatten.flvweight_19.test1;



//��Ԫ���󣺷�װ��Ȩ�������ظ����ֲ��ֵ���Ԫ����
public class AuthorizationFlyweight implements Flyweight{

	//�ڲ�״̬����ȫʵ��
	private String securityEntity;

	//�ڲ�״̬��Ȩ��
	private String permit;

	/**
	 * н������,�鿴
	 * н������,�޸�
	 * ��Ա�б�,�鿴

	 * ���췽�� - ����״̬����
	 * @param state ״̬���ݣ�������ȫʵ���Ȩ�޵����ݣ���","�ָ�
	 */
	public AuthorizationFlyweight(String state){
		String ss[] = state.split(",");
		securityEntity = ss[0];
		permit = ss[1];
	}



	public String getSecurityEntity() {
		return securityEntity;
	}


	public void setSecurityEntity(String securityEntity) {
		this.securityEntity = securityEntity;
	}


	public String getPermit() {
		return permit;
	}


	public void setPermit(String permit) {
		this.permit = permit;
	}


   
	/* 
	 * �����ⲿ״̬
	 * securityEntity ��ȫʵ��
	 * permit  Ȩ��
	 */
	@Override
	public boolean match(String securityEntity, String permit) {
		if(this.securityEntity.equals(securityEntity) &&
				this.permit.equals(permit)){
			return true;
		}
		return false;
	}




}
