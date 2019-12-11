package designpatten.bridge_23.test1.sendimpl;


import designpatten.bridge_23.test1.MessageImplementor;

//����һ��: ���ֻ�����Ϣ�ķ�ʽ������Ϣ
public class MessageMobile implements MessageImplementor {

	@Override
	public void send(String message, String toUser) {
		System.out.println("ʹ�á��ֻ�����Ϣ���ķ�ʽ��������Ϣ '"+message+"' �� "+toUser);
	}

}
