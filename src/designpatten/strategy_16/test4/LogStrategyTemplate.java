package designpatten.strategy_16.test4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//ģ�巽��
public abstract class LogStrategyTemplate implements LogStrategy{

	
	
	@Override
	public final void log(String msg) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		msg = df.format(new Date())+" �����ǣ�"+msg;
		doLog(msg);	
	}


    //����ִ����־��¼
	protected abstract void doLog(String msg);

}
