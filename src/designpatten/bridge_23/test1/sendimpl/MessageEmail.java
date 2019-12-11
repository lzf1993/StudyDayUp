package designpatten.bridge_23.test1.sendimpl;


import designpatten.bridge_23.test1.MessageImplementor;

//�� E-mail�ķ�ʽ������Ϣ
public class MessageEmail implements MessageImplementor {

	@Override
	public void send(String message, String toUser) {
		System.out.println("ʹ�á�E-mail���ķ�ʽ��������Ϣ '"+message+"' �� "+toUser);
	}

}
