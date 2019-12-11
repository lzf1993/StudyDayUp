package designpatten.strategy_16.test4.impl;

import designpatten.strategy_16.test4.LogStrategyTemplate;

public class FileLog extends LogStrategyTemplate{

	@Override
	protected void doLog(String msg) {
		System.out.println("���ڰ� �� "+msg+" �� ��¼���ļ���");
	}

}
