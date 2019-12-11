package designpatten.command_12.test4.cookimpl;


import designpatten.command_12.test4.Command;
import designpatten.command_12.test4.CommandQueue;
import designpatten.command_12.test4.CookApi;


//�����˵ĳ�ʦ
public class CoolCook implements CookApi, Runnable{

	private String name;

	public CoolCook(String name){
		this.name = name;
		System.out.println("���˳�ʦ "+ name +" �ϰ��� ");
	}



	/* 
	 * ��ʼ����
	 */
	@Override
	public void cook(int tableNum, String name) {		
		//����ʱ�� -- �����
		int cookTime = (int) (20 *Math.random()+6);
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
			Command cmd = CommandQueue.getCoolOneCommand();
			if(cmd!=null){
				cmd.setCookApi(this);
				cmd.execute();
			}
		}

	}

}
