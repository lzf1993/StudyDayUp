package designpatten.bridge_23.example.impl;


import designpatten.bridge_23.example.Message;

//��ͨ��Ϣ����E-mail�ķ�ʽ������ͨ��Ϣ
public class CommonMessageEmail implements Message {

	@Override
	public void send(String msg, String toUser) {
		System.out.println("ʹ��E-mail�ķ�ʽ��������Ϣ"+msg+"��"+toUser);
	}

}
