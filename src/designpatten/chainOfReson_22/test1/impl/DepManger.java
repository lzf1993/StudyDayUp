package designpatten.chainOfReson_22.test1.impl;

import designpatten.chainOfReson_22.test1.Handler;

//��Ŀ����Ĵ���
public class DepManger extends Handler{

	@Override
	public String handleFeeRequest(String user, double fee) {
		String str = "";
		if(fee<1000){
			//Ϊ�˲��Լ򵥵㣬ֻҪ��С��Ͷ�ͬ��
			if("С��".equals(user)){
				str = "���ž���ͬ��"+user+"�۲ͷ���"+fee+"Ԫ������";
			}else{
				str = "���ž���ͬ��"+user+"�۲ͷ���"+fee+"Ԫ������";
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
