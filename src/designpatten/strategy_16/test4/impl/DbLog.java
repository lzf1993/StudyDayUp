package designpatten.strategy_16.test4.impl;

import designpatten.strategy_16.test4.LogStrategyTemplate;

public class DbLog extends LogStrategyTemplate{

	@Override
	protected void doLog(String msg) {
		//�������
		if(msg!=null && msg.trim().length()>5){
			int a =5/0;
		}
		System.out.println("���ڰ� �� "+msg+" ����¼�����ݿ���");		
	}

}
