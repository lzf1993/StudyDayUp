package designpatten.chainOfReson_22.test2.impl;

import designpatten.chainOfReson_22.test2.Handler;
import designpatten.chainOfReson_22.test2.model.FeeRequestModel;
import designpatten.chainOfReson_22.test2.model.RequestModel;


//��Ŀ������۲ͷ�����������
public class ProjectManger extends Handler{
	
	
	@Override
	public Object handleRequest(RequestModel model) {
		if(FeeRequestModel.FEE_TYPE.equals(model.getType())){
			return handleFeeRequest(model);
		}else{
			return super.handleRequest(model);
		}
	}
	
	
	/**
	 * ����۲�����
	 * @param model
	 * @return
	 */
	private Object handleFeeRequest(RequestModel model){
		FeeRequestModel m = (FeeRequestModel) model;
		String str = "";
		if(m.getFee()<1000){
			//Ϊ�˲��Լ򵥵㣬ֻҪ��С��Ͷ�ͬ��
			if("С��".equals(m.getUser())){
				str = "���ž���ͬ��"+m.getUser()+"�۲ͷ���"+m.getFee()+"Ԫ������";
			}else{
				str = "���ž���ͬ��"+m.getUser()+"�۲ͷ���"+m.getFee()+"Ԫ������";
			}
			return str;
		}else{
			//����500�����ݸ������˴���
			if(this.handler!=null){
				return handler.handleRequest(model);
			}
		}
		return str;
	}

}
