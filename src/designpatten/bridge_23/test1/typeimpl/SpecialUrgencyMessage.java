package designpatten.bridge_23.test1.typeimpl;


import designpatten.bridge_23.test1.AbstractMessage;
import designpatten.bridge_23.test1.MessageImplementor;

//�ؼ���Ϣ
public class SpecialUrgencyMessage extends AbstractMessage {

	public SpecialUrgencyMessage(MessageImplementor impl) {
		super(impl);
	}
	
	
	@Override
	public void sendMessage(String message, String toUser) {
		message = "�� �ؼ�����"+message;
		super.sendMessage(message, toUser);
	}
	
	
	//��չ�µĹ��ܣ��ߴٹ���
	public void hurry(String msgId){
		//ִ�дߴٵ�ҵ�񣬷����ߴٵ���Ϣ
	}

}
