package designpatten.command_12.test4.cookimpl;

import designpatten.command_12.test4.Command;
import designpatten.command_12.test4.CommandQueue;
import designpatten.command_12.test4.CookApi;


//���Ȳ˵ĳ�ʦ
public class HotCook implements CookApi, Runnable{

	private String name;

	public HotCook(String name){
		this.name = name;
		System.out.println("�Ȳ˳�ʦ "+ name +" �ϰ��� ");
	}



	/* 
	 * ��ʼ����
	 */
	@Override
	public void cook(int tableNum, String name) {		
		//����ʱ�� -- �����
		int cookTime = (int) (20 *Math.random());
		System.out.println(this.name+" ��ʦ����Ϊ  "+tableNum+" �������� "+name);
	  
		try {
			//˯�� -- ��ʾ������
			Thread.sleep(cookTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			
        System.out.println(this.name+" ��ʦΪ "+tableNum+" ����������: "+name+"������ʱ = "+cookTime+"��");
	}



	//��ʦ���ϵĸɻ��Ҫ���Ĳ��б�����ѡ��˿�ʼ����
	@Override
	public void run() {
		while(true){
			Command cmd = CommandQueue.getHotOneCommand();
			if(cmd!=null){
				cmd.setCookApi(this);
				cmd.execute();
			}
		}

	}

}
