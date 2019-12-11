package designpatten.visitor_24.example.impl;

import designpatten.visitor_24.example.Customer;

//��ҵ�ͻ�
public class EnterpriseCustomer extends Customer{
	
	//��ϵ��
	private String linkman;
	
	
	//��ϵ�绰
	private String linkTelephone;
	
	
	//��ҵע���ַ
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
	
	
	//1����ҵ������������
	@Override
	public void serviceRequest() {
		//��ҵ�ͻ��������ķ�������
		System.out.println(this.getName()+" ��ҵ����������� ");
	}


	//2����ҵ�û��Թ�˾��Ʒ��ƫ�÷���
	@Override
	public void predilectionAnalyze() {
		//���������������ʷ��Ǳ�ڹ��������Լ��ͻ�������ҵ�ķ�չ���ơ��ͻ��ķ�չԤ�ڽ��з���
		System.out.println("���ڶ���ҵ�ͻ�  '"+this.getName()+"' ���в�Ʒƫ�÷���");
	}


	//3����ҵ�ͻ���ֵ����
	@Override
	public void worthAnalyze() {
		//���ݹ���Ľ���С������Ĳ�Ʒ�͸�Ǯ�Ķ��٣����з���
		System.out.println("������ҵ�ͻ�  '"+this.getName()+"' ���м�ֵ����");
	}


	
}
