package designpatten.chainOfReson_22.test1.impl;

import designpatten.chainOfReson_22.test1.Handler;

//��Ŀ����Ĵ���
public class ProjectManger extends Handler{

	@Override
	public String handleFeeRequest(String user, double fee) {
		String str = "";
		if(fee<500){
			//Ϊ�˲��Լ򵥵㣬ֻҪ��С��Ͷ�ͬ��
			if("С��".equals(user)){
				str = "��Ŀ����ͬ��"+user+"�۲ͷ���"+fee+"Ԫ������";
			}else{
				str = "��Ŀ����ͬ��"+user+"�۲ͷ���"+fee+"Ԫ������";
			}
			return str;
		}else{
			if(this.successor!=null){
				return successor.handleFeeRequest(user, fee);
			}
		}
		return str;
	}

}
