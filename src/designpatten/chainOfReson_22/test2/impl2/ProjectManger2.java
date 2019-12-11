package designpatten.chainOfReson_22.test2.impl2;

import designpatten.chainOfReson_22.test2.impl.ProjectManger;
import designpatten.chainOfReson_22.test2.model.FeeRequestModel;
import designpatten.chainOfReson_22.test2.model.PreFeeRequestModel;
import designpatten.chainOfReson_22.test2.model.RequestModel;


//��Ŀ����������÷����߼�
public class ProjectManger2 extends ProjectManger{
	
	
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
		if(m.getFee()<500){
			//Ϊ�˲��Լ򵥵㣬ֻҪ��С��Ͷ�ͬ��
			if("С��".equals(m.getUser())){
				str = "���ž���ͬ��"+m.getUser()+"Ԥ֧���÷���"+m.getFee()+"Ԫ������";
			}else{
				str = "���ž���ͬ��"+m.getUser()+"Ԥ֧���÷���"+m.getFee()+"Ԫ������";
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
