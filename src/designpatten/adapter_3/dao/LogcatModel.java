package designpatten.adapter_3.dao;

import java.io.Serializable;

//日志实体类
public class LogcatModel implements Serializable{
	private static int id =0;
	private int logId;
	private String time;
	private String content;


	public LogcatModel(String content) {
		super();
		id++;
		this.logId = id;
		this.time = System.currentTimeMillis()+"";
		this.content = content;
	}

	public int getId() {
		return logId;
	}
	public void setId(int id) {
		this.logId = id;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "LogcatModel [logId=" + logId + ", time=" + time + ", content=" + content + "]";
	}


}
