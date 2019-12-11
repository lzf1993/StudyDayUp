package designpatten.strategy_16.test3.impl;

import designpatten.strategy_16.test3.LogStrategy;

public class FileLog implements LogStrategy{

	@Override
	public void log(String msg) {
		System.out.println("���ڰ� �� "+msg+" �� ��¼���ļ���");
	}

}
