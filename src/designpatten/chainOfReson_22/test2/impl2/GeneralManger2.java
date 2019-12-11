package designpatten.chainOfReson_22.test2.impl2;

import designpatten.chainOfReson_22.test2.impl.GeneralManger;
import designpatten.chainOfReson_22.test2.model.FeeRequestModel;
import designpatten.chainOfReson_22.test2.model.PreFeeRequestModel;
import designpatten.chainOfReson_22.test2.model.RequestModel;


//�ܾ�������÷����߼�
public class GeneralManger2 extends GeneralManger{
	
	@Override
	public Object handleRequest(RequestModel model) {
		if(PreFeeRequestModel.FEE_TYPE.equals(model.getType())){
			return handleFeeRequest2(model);
		}else{
			return super.handleRequest(model);
		}
	}
	
	
	/**
	 * ����۲�����
	 * @param model
	 * @return
	 */
	private Object handleFeeRequest2(RequestModel model){
		PreFeeRequestModel m = (PreFeeRequestModel) model;
		String str = "";
		if(m.getFee()>1000){
			//Ϊ�˲��Լ򵥵㣬ֻҪ��С��Ͷ�ͬ��
			if("С��".equals(m.getUser())){
				str = "�ܾ���ͬ��"+m.getUser()+"Ԥ֧���÷���"+m.getFee()+"Ԫ������";
			}else{
				str = "�ܾ���ͬ��"+m.getUser()+"Ԥ֧���÷���"+m.getFee()+"Ԫ������";
			}
			return str;
		}else{
			//С��1000�����ݸ������˴���
			if(this.handler!=null){
				return handler.handleRequest(model);
			}
		}
		return str;
	}
}
