package designpatten.strategy_16.test4;

import designpatten.strategy_16.test4.impl.DbLog;
import designpatten.strategy_16.test4.impl.FileLog;

public class LogStrategyContext {

    //������
	LogStrategy strategy1 = new DbLog();
	LogStrategy strategy2 = new FileLog();


	public void log(String msg){
		try{
			//Ĭ��ʹ�����ݿ�洢
			strategy1.log(msg);
		}catch(Exception e){
			//�����쳣ʹ���ļ��洢
			strategy2.log(msg);
		}
	}

}
