package designpatten.chainOfReson_22.test3;

//����ְ�����Ľӿ�
public abstract class SaleHandler {

	//������һ����������Ķ���
	protected SaleHandler successor = null;
		
	//������һ����������Ķ���
	public void setSuccessor(SaleHandler successor){
		this.successor = successor;
	}
	
	
	/**
	 * @param user  ������Ա
	 * @param customer �ͻ�
	 * @param saleModel ��������
	 * @return �Ƿ���ɹ�
	 */
	public abstract boolean sale(String user,String customer,SaleModel saleModel);
	
	
	
}
