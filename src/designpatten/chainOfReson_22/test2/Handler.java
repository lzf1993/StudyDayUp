package designpatten.chainOfReson_22.test2;

import designpatten.chainOfReson_22.test2.model.RequestModel;


//���νӿ�
public abstract class Handler {
	
	//������һ����������Ķ���
	protected Handler handler;
	
	public void setHandler(Handler handler){
		this.handler = handler;
	}
	
	
	
	/**
	 * ͨ�õ���������
	 * @param model
	 * @return
	 */
	public Object handleRequest(RequestModel model){
		if(handler!=null){
			return this.handler.handleRequest(model);
		}else{
			System.out.println("û�к����������߲�֧�ָ����");
			return false;
		}
	}
	
}
