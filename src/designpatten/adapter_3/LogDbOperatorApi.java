package designpatten.adapter_3;

import java.util.List;

import designpatten.adapter_3.dao.LogcatModel;


public interface LogDbOperatorApi {
	
	public void createLog(LogcatModel model);

	public void deleteLog(int logId);
	
	public void updateLog(int logId);
	
	public List<LogcatModel> getLogs();
}
