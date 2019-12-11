package designpatten.visitor_24.test1.impl;

import designpatten.visitor_24.test1.Customer;
import designpatten.visitor_24.test1.Visitor;


//�����û�
public class PersonalCustomer extends Customer{

	//�绰����
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


	/* 
	 * �ø����û����շ��ʣ���������߶��󣬲��ص���������Ӧ�ķ���
	 */
	@Override
	public void accept(Visitor visitor) {
		//���÷����߶�����Ӧ����
		visitor.visitPersonalCustomer(this);
	}

}
