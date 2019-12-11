package designpatten.adapter_3;

import java.util.Iterator;
import java.util.List;

import designpatten.adapter_3.dao.LogcatModel;
import designpatten.adapter_3.impl.LogFileImpl;


//适配器模式，用已有的功能实现新的接口 : 用之前文件存储的功能实现数据库操作接口
public class LogFileToDbAdapter implements LogDbOperatorApi{

	private LogFileImpl fileImpl;


	public LogFileToDbAdapter(LogFileImpl fileImpl){
		this.fileImpl = fileImpl;
	}


	@Override
	public void createLog(LogcatModel model) {
		//先读取
		List<LogcatModel> list = fileImpl.readLogFile();
		//再添加
		list.add(model);
		//再写入
		fileImpl.writeLogFile(list);
	}

	@Override
	public void deleteLog(int logId) {
		//先读取
		List<LogcatModel> list = fileImpl.readLogFile();
		//删除
		Iterator<LogcatModel> iterable = list.iterator();
		while(iterable.hasNext()){
			LogcatModel model = iterable.next();
			if(model.getId() == logId){
				iterable.remove();
			}
		}
		//再写入
		fileImpl.writeLogFile(list);
	}

	@Override
	public void updateLog(int logId) {
		//先读取
		List<LogcatModel> list = fileImpl.readLogFile();
		if(list!=null && list.size()>0){
			for(LogcatModel model:list){
				if(model.getId() == logId){
					System.out.println("更新");
				}
			}
		}
	}

	@Override
	public List<LogcatModel> getLogs() {
		//先读取
		List<LogcatModel> list = fileImpl.readLogFile();
		return list;
	}

}
