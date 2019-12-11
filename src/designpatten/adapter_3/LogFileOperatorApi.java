package designpatten.adapter_3;

import java.util.List;

import designpatten.adapter_3.dao.LogcatModel;


//文件操作日志接口
public interface LogFileOperatorApi {
	
	public void writeLogFile(List<LogcatModel> modles);
	
	public List<LogcatModel> readLogFile();
	
}
