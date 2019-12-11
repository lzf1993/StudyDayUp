package designpatten.visitor_24.test1.impl;

import designpatten.visitor_24.test1.Customer;
import designpatten.visitor_24.test1.Visitor;

//��ҵ�û� 
public class EnterpriseCustomer extends Customer{

	//����
	private String linkman;

	//�绰
	private String linkTelephone;

	//��ҵ��ַ
	private String registerAddress;


	public String getLinkman() {
		return linkman;
	}


	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}


	public String getLinkTelephone() {
		return linkTelephone;
	}


	public void setLinkTelephone(String linkTelephone) {
		this.linkTelephone = linkTelephone;
	}


	public String getRegisterAddress() {
		return registerAddress;
	}


	public void setRegisterAddress(String registerAddress) {
		this.registerAddress = registerAddress;
	}


	/* 
	 * ����ҵ�û����շ��ʣ��ص���������Ӧ�ķ���
	 */
	@Override
	public void accept(Visitor visitor) {
		//�ص������߶������Ӧ����
		visitor.visitEnterpriseCustomer(this);
	}

}
