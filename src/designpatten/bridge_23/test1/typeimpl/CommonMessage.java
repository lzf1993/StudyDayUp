package designpatten.bridge_23.test1.typeimpl;


import designpatten.bridge_23.test1.AbstractMessage;
import designpatten.bridge_23.test1.MessageImplementor;

//��ͨ��Ϣ
public class CommonMessage extends AbstractMessage {

	public CommonMessage(MessageImplementor impl) {
		super(impl);
	}

	@Override
	public void sendMessage(String message, String toUser) {
		//������ͨ��Ϣ��ʲô�����ɣ�ֱ�ӵ��ø���ķ���������Ϣ���ͳ�ȥ
		super.sendMessage(message, toUser);
	}
	
}
