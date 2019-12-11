package designpatten.bridge_23.example.urgimpl;


import designpatten.bridge_23.example.UrgencyMessage;

//�Ӽ���Ϣ�� ��վ�ڷ�ʽ ���ͼӼ���Ϣ
public class UrgencyMessaeSMS implements UrgencyMessage {

	@Override
	public void send(String msg, String toUser) {
		msg = "�Ӽ�" + msg;
		System.out.println("ʹ��վ�ڶ���Ϣ�ķ�ʽ������Ϣ"+msg+"��"+toUser);
	}

	@Override
	public Object watch(String msgId) {
		//��ȡ����Ӧ�����ݣ���֯�ɼ�ص����ݶ���Ȼ�󷵻�
		return null;
	}

}
