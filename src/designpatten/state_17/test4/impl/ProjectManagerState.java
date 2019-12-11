package designpatten.state_17.test4.impl;

import java.util.Scanner;

import designpatten.state_17.test4.LeaveRequestState;
import designpatten.state_17.test4.StateMachine;
import designpatten.state_17.test4.model.LeaveRequestionModel;

//������Ŀ�������ˣ�����֮�󣬿��ܶ�Ӧ���ž������ ���� ��˽��� ֮�е�һ��
public class ProjectManagerState implements LeaveRequestState{

	@Override
	public void doWork(StateMachine request) {
		LeaveRequestionModel model = (LeaveRequestionModel) request.getData();
		System.out.println("��Ŀ���������,���Ժ�...");
		System.out.println(model.getUser()+"�����"+model.getBeginDate()+"��ʼ���"+
				model.getDays()+"��,����Ŀ������ˣ�1��ͬ��  2����ͬ�⣩");
		//��ȡ����̨����
		Scanner scanner = new Scanner(System.in);
		if(scanner.hasNext()){
			int a = scanner.nextInt();
			String result = "��ͬ��";
			if(a==1){
				result = "ͬ��";
			}
			model.setResult(result);
			if(a==1){
				//�����������3��
				if(model.getDays()>3){
					//�����������3�죬������Ŀ����ͬ�⣬�򽻸����ž���
					request.setState(new DepManagerState());
				}else{
					//�������3���ڣ�������Ŀ����ͬ�⣬��������
					request.setState(new AuditOverState());
				}

			}else{
				//��Ŀ����ͬ�⣬�������
				request.setState(new AuditOverState());
			}
			request.doWork();
		}

	}
}

