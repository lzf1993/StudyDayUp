package designpatten.bridge_23.example.impl;


import designpatten.bridge_23.example.Message;

//��ͨ��Ϣ����վ�ڶ���Ϣ�ķ�ʽ������ͨ��Ϣ
public class CommonMessageSMS implements Message {

	@Override
	public void send(String msg, String toUser) {
		System.out.println("ʹ��վ�ڶ���Ϣ�ķ�ʽ��������Ϣ"+msg+"��"+toUser);
	}
	
	

}
