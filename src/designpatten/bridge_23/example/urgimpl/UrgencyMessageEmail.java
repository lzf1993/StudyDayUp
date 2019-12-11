package designpatten.bridge_23.example.urgimpl;

import designpatten.bridge_23.example.UrgencyMessage;


//�Ӽ���Ϣ�� ��E-mail��ʽ����  �Ӽ���Ϣ 
public class UrgencyMessageEmail implements UrgencyMessage {

	@Override
	public void send(String msg, String toUser) {
		msg = "�Ӽ�" + msg;
		System.out.println("ʹ��E-mail�ķ�ʽ������Ϣ"+msg+"��"+toUser);
	}

	@Override
	public Object watch(String msgId) {
		//��ȡ����Ӧ�����ݣ���֯�ɼ�ص����ݶ���Ȼ�󷵻�
		return null;
	}


}
