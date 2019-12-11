package designpatten.state_17.test4.impl;

import designpatten.state_17.test4.LeaveRequestState;
import designpatten.state_17.test4.StateMachine;
import designpatten.state_17.test4.model.LeaveRequestionModel;

//������˽�������
public class AuditOverState implements LeaveRequestState{

	@Override
	public void doWork(StateMachine request) {
		//����ҵ�����
		LeaveRequestionModel model = (LeaveRequestionModel) request.getData();
		//ҵ�����������м�¼�������̽���
		System.out.println(model.getUser()+"��������������Ѿ���˽���������ǣ�"+model.getResult());
	}

}
