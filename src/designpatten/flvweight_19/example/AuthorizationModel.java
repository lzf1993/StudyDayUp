package designpatten.flvweight_19.example;


//Ȩ��ʵ��
public class AuthorizationModel {

	//�û�
	private String user;
	
	//��ȫʵ�壺н�����ݡ���Ա�б�
	private String securityEntity;
	
	//Ȩ�ޣ��鿴���޸�
	private String permit;

	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
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
	
	
}
