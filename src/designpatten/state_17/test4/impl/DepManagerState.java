package designpatten.state_17.test4.impl;

import java.util.Scanner;

import designpatten.state_17.test4.LeaveRequestState;
import designpatten.state_17.test4.StateMachine;
import designpatten.state_17.test4.model.LeaveRequestionModel;

//���ž�����ˣ� ������Ӧ��˽�����״̬
public class DepManagerState implements LeaveRequestState{

	@Override
	public void doWork(StateMachine request) {
		//����ҵ�����
		LeaveRequestionModel model = (LeaveRequestionModel) request.getData();
		System.out.println("���ž��������,���Ժ�...");
		System.out.println(model.getUser()+"�����"+model.getBeginDate()+"��ʼ���"+
				model.getDays()+"��,�벿�ž�����ˣ�1��ͬ��  2����ͬ�⣩");
		
		Scanner scanner = new Scanner(System.in);
		if(scanner.hasNext()){
			int a = scanner.nextInt();
			String result = "��ͬ��";
			if(a == 1){
				result ="ͬ��";
			}
			model.setResult(result);
			//���ö�����˽���
			request.setState(new AuditOverState());
			request.doWork();
		}
	}

}
