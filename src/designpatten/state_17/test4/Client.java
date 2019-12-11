package designpatten.state_17.test4;

import java.text.SimpleDateFormat;
import java.util.Date;

import designpatten.state_17.test4.impl.ProjectManagerState;
import designpatten.state_17.test4.model.LeaveRequestionModel;

public class Client {

	
	public static void main(String args[]){
		
		//����ҵ�����
		LeaveRequestionModel model = new LeaveRequestionModel();
		model.setUser("С��");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		model.setBeginDate(format.format(new Date()));
		model.setDays(2);
		
		
		//���������Ķ���
		LeaveRequestContext context = new LeaveRequestContext();
		context.setData(model);
		context.setState(new ProjectManagerState());
		context.doWork();
	}
}
