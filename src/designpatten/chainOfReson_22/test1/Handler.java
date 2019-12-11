package designpatten.chainOfReson_22.test1;


//��������������Ľӿ�
public abstract class Handler {

	//������һ����������Ķ���
	protected Handler successor = null;
	
	
	//������һ����������Ķ���
	public void setSuccessor(Handler handler){
		this.successor = handler;
	}
	
	
	/**
	 * ����۲ͷ��õ�����
	 * @param user ������
	 * @param fee  �����money
	 * @return �ɹ�����ʧ�ܵľ���֪ͨ
	 */
	public abstract String handleFeeRequest(String user,double fee);
	
	
}
