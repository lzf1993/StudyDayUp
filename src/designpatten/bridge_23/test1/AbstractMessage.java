package designpatten.bridge_23.test1;


//�������Ϣ����
public abstract class AbstractMessage {

	//����һ��ʵ�ֲ��ֵĶ���
	protected MessageImplementor impl;
	
	
	//����ʵ�ֲ��ֵĶ���
	public AbstractMessage(MessageImplementor impl){
		this.impl = impl;
	}
	
	
	/**
	 * ������Ϣ��ת��ʵ�ֲ��ֵķ���
	 * @param message Ҫ���͵���Ϣ����
	 * @param toUser   ��Ϣ���͵�Ŀ����Ա
	 */
	public void sendMessage(String message, String toUser){
		this.impl.send(message, toUser);
	}
}
