package designpatten.bridge_23.example;


//�Ӽ���Ϣ�ĳ���ӿ�
public interface UrgencyMessage extends Message{
	
	
	/**
	 * ���ĳ��Ϣ�Ĵ������ 
	 * @param msgId ����ص���Ϣ���
	 * @return ������ص����ݶ���ʾ��һ�£���Object
	 */
	public Object watch(String msgId);

}
