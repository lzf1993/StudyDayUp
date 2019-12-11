package designpatten.bridge_23.example.specialimpl;


import designpatten.bridge_23.example.SpecialUrgencyMessage;

//�ؼ���Ϣ����E-mail��ʽ�����ؼ���Ϣ
public class SpecialUrgencyMessageEmail implements SpecialUrgencyMessage {

	@Override
	public void send(String msg, String toUser) {
		msg = "�ؼ�" + msg;
		System.out.println("ʹ��E-mail�ķ�ʽ������Ϣ"+msg+"��"+toUser);
	}

	@Override
	public void urgeMessage(String msg) {
		System.out.println("�ؼ���Ϣ��û����ɣ�ֱ�Ӵߴ�");
	}

}
