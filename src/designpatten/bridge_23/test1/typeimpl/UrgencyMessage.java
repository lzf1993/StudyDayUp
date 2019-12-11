package designpatten.bridge_23.test1.typeimpl;


import designpatten.bridge_23.test1.AbstractMessage;
import designpatten.bridge_23.test1.MessageImplementor;

//�Ӽ���Ϣ
public class UrgencyMessage extends AbstractMessage {

	public UrgencyMessage(MessageImplementor impl) {
		super(impl);
	}
	
	
	
	/*
	 * �Ӽ���Ϣ��������Ϣǰ�����ӼӼ�����
	 */
	@Override
	public void sendMessage(String message, String toUser) {
		message = "�� �Ӽ�����"+message;
		super.sendMessage(message, toUser);
	}
	
	
	/**
	 * ��չ�Լ��µĹ������ĳ��Ϣ�Ĵ�����
	 * @param msgId ��Ϣid
	 * @return ������ص�������
	 */
	public Object watch(String msgId){
		//��ȡ��Ӧ�����ݣ���֯�ɼ�ص����ݶ���Ȼ�󷵻�
		return null;
	}
	

}
