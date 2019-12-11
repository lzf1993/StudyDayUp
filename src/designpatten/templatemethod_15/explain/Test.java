package designpatten.templatemethod_15.explain;

import designpatten.templatemethod_15.explain.better.LoginTemplate;
import designpatten.templatemethod_15.explain.better.NormalLogin;
import designpatten.templatemethod_15.explain.better.WorkerLogin;
import designpatten.templatemethod_15.explain.better.model.LoginModel;

public class Test {
  
	public static void main(String args[]){
		
		LoginModel loginModel = new LoginModel();
		loginModel.setLoginId("admin");
		loginModel.setPwd("123456");
		
		LoginTemplate lt1 = new NormalLogin();
		LoginTemplate lt2 = new WorkerLogin();
		
		boolean flag1 = lt1.login(loginModel);
		boolean flag2 = lt2.login(loginModel);
		
		System.out.println("��ͨ�û���¼��"+flag1);
		System.out.println("�����û���¼��"+flag2);
	}
}
