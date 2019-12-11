package designpatten.command_12.test4;

import designpatten.command_12.test4.cookimpl.CoolCook;
import designpatten.command_12.test4.cookimpl.HotCook;

//��ʦ������
public class CookManger {

	private static boolean runFlg = false;
	
	
	
	
	public static void runCookManger(){
		if(!runFlg){
			runFlg = true;
			
			//������ʦ
			HotCook cook1 = new HotCook("����");
			HotCook cook2 = new HotCook("����");
			HotCook cook3 = new HotCook("����");
			HotCook cook4 = new HotCook("����");			
			CoolCook cook5 = new CoolCook("����");
			CoolCook cook6 = new CoolCook("���");
			
			//��ʼ�ɻ�
			Thread t1 = new Thread(cook1);
			t1.start();
			Thread t2 = new Thread(cook2);
			t2.start();
			Thread t3 = new Thread(cook3);
			t3.start();
			Thread t4 = new Thread(cook4);
			t4.start();
			Thread t5 = new Thread(cook5);
			t5.start();
			Thread t6 = new Thread(cook6);
			t6.start();
		}
	}
	
	
	
	
}
