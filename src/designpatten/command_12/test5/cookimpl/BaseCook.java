package designpatten.command_12.test5.cookimpl;

import java.util.Random;

import designpatten.command_12.test5.Command;
import designpatten.command_12.test5.CommandQueue;
import designpatten.command_12.test5.CookApi;

public abstract class BaseCook implements CookApi,Runnable{

	//���
	protected int num;

	//����
	protected String name;

	public BaseCook(int num,String name){
		this.num = num;
		this.name = name;
	}


	@Override
	public void cook(String name, int tableNum) {
		//��ʼ���������ʱ��
		System.out.println("- "+num+"�ų�ʦ: ��ʼ��  ��"+tableNum+"�����Ĳ�: "+name+" ��"+"- ");
		Random random = new Random();
		int time = random.nextInt(10)+3;
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("--- "+num+"�ų�ʦ: ������ �� "+tableNum+"�����Ĳ�: "+name+"����ʱ:"+time+"�롿"+"--- ");
	}




	@Override
	public void run() {
		while(true){
			//ȡ��
			Command cmd = getOneCommand();
			if(cmd != null){
				cmd.setCook(this);  //���ó�ʦ
				cmd.excute();
			}
		}
	}


	@Override
	public int getNum() {
		return num;
	}


	public abstract Command getOneCommand();

}
