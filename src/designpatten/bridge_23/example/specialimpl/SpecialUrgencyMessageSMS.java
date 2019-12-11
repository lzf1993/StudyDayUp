package designpatten.bridge_23.example.specialimpl;


import designpatten.bridge_23.example.SpecialUrgencyMessage;

//�ؼ���Ϣ �� ��վ�ڵķ�ʽ�����ؼ���Ϣ
public class SpecialUrgencyMessageSMS implements SpecialUrgencyMessage {

	@Override
	public void send(String msg, String toUser) {
		msg = "�ؼ�" + msg;
		System.out.println("ʹ��վ�ڶ���Ϣ�ķ�ʽ������Ϣ"+msg+"��"+toUser);
		
	}

	@Override
	public void urgeMessage(String msg) {
		System.out.println("�ؼ���Ϣ��û����ɣ�ֱ�Ӵߴ�");
	}

}
