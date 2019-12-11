package designpatten.strategy_16.test3.impl;

import designpatten.strategy_16.test3.LogStrategy;

public class DbLog implements LogStrategy{

	@Override
	public void log(String msg) {

		//�������
		if(msg!=null && msg.trim().length()>5){
			int a =5/0;
		}
		
		System.out.println("���ڰ� �� "+msg+" ����¼�����ݿ���");
		 
	}

}
