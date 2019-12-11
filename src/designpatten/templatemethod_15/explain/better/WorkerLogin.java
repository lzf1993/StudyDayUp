package designpatten.templatemethod_15.explain.better;

import designpatten.templatemethod_15.explain.better.model.LoginModel;


//������Ա��¼
public class WorkerLogin extends LoginTemplate{


	//�����û���Ϣ
	@Override
	public LoginModel findLoginUser(String loginId) {
		LoginModel loginModel = new LoginModel();
		loginModel.setLoginId(loginId);
		loginModel.setPwd("1234561");
		return loginModel;
	}


	//���м��� -- ��д�����㷨
	@Override
	public String encryPwd(String pwd) {
		String pwd2 = pwd +"1";
		return pwd2;
	}

}
