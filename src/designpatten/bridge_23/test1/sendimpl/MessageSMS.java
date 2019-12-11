package designpatten.bridge_23.test1.sendimpl;


import designpatten.bridge_23.test1.MessageImplementor;

//��վ�ڶ���Ϣ�ķ�ʽ������Ϣ
public class MessageSMS implements MessageImplementor {

	@Override
	public void send(String message, String toUser) {
		System.out.println("ʹ�á�վ�ڶ���Ϣ���ķ�ʽ��������Ϣ '"+message+"' �� "+toUser);
	}

}

