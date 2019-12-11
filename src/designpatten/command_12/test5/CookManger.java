package designpatten.command_12.test5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import designpatten.command_12.test5.cookimpl.BaseCook;
import designpatten.command_12.test5.cookimpl.CoolCook;
import designpatten.command_12.test5.cookimpl.HotCook;

//�������
public class CookManger {

	//ͬʱֻ��������ʦ����
	private static ExecutorService pool = Executors.newFixedThreadPool(2);

	//��ʦ
	private static List<BaseCook> cooks = new ArrayList<>();

	static{	
		//������ʦ
		HotCook cook1 = new HotCook(1,"����");
		HotCook cook2 = new HotCook(2,"����");
		HotCook cook3 = new HotCook(3,"����");
		HotCook cook4 = new HotCook(4,"����");			
		CoolCook cook5 = new CoolCook(5,"����");
		CoolCook cook6 = new CoolCook(6,"���");
		//��¼
		cooks.add(cook1);
		cooks.add(cook2);
		cooks.add(cook3);
		cooks.add(cook4);
		cooks.add(cook5);
		cooks.add(cook6);
	}

	
	//����µĳ�ʦ
	public static void addCook(BaseCook cookApi){
		cooks.add(cookApi);
	}
	
	
	
	//��ȡ��ʦ
	public static BaseCook getCook(int num){
		for(BaseCook c:cooks){
			if(c.getNum() == num){
				return c;
			}
		}
		return null;
	}
	
	
	
	public static void startWork(){
		System.out.println("�����ʼ�ɻ���.....");
		for(BaseCook c:cooks){
			pool.submit(c);
		}
	}
	
}
