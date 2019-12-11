package designpatten.visitor_24.example.impl;

import designpatten.visitor_24.example.Customer;


//���˿ͻ�
public class PersonalCustomer extends Customer{

	//��ϵ�绰
	private String telephone;


	//����
	private int age;



	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;   
	}


	//1���ͻ��������
	@Override
	public void serviceRequest() {
		//��ҵ�ͻ��������ķ�������
		System.out.println("�ͻ�'"+this.getName()+"' ����������� ");
	}


	//2����ҵ�û��Թ�˾��Ʒ��ƫ�÷���
	@Override
	public void predilectionAnalyze() {
		//���������������ʷ��Ǳ�ڹ��������Լ��ͻ�������ҵ�ķ�չ���ơ��ͻ��ķ�չԤ�ڽ��з���
		System.out.println("���ڶԸ��˿ͻ� '"+this.getName()+"' ���в�Ʒƫ�÷���");
	}


	//3����ҵ�ͻ���ֵ����
	@Override
	public void worthAnalyze() {
		//���ݹ���Ľ���С������Ĳ�Ʒ�͸�Ǯ�Ķ��٣����з���
		System.out.println("���ڸ��˿ͻ�  '"+this.getName()+"' ���м�ֵ����");
	}


}
