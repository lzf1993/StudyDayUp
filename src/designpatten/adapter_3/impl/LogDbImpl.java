package designpatten.adapter_3.impl;

import java.util.ArrayList;
import java.util.List;

import designpatten.adapter_3.LogDbOperatorApi;
import designpatten.adapter_3.dao.LogcatModel;


public class LogDbImpl implements LogDbOperatorApi {

	@Override
	public void createLog(LogcatModel model) {
		System.out.println("db createLog...");
	}

	@Override
	public void deleteLog(int logId) {
		System.out.println("db deleteLog...");
	}

	@Override
	public void updateLog(int logId) {
		System.out.println("db updateLog...");
	}

	@Override
	public List<LogcatModel> getLogs() {
		System.out.println("db getLogs...");
		List<LogcatModel> modles = new ArrayList<>();
		modles.add(new LogcatModel("log1"));
		modles.add(new LogcatModel("log2"));
		return modles;
	}

}
