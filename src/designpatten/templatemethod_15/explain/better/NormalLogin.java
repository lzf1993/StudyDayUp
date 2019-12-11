package designpatten.templatemethod_15.explain.better;

import designpatten.templatemethod_15.explain.better.model.LoginModel;



//��ͨ�û���¼
public class NormalLogin extends LoginTemplate{

	
	//�����û���Ϣ
	@Override
	public LoginModel findLoginUser(String loginId) {
		LoginModel loginModel = new LoginModel();
		loginModel.setLoginId(loginId);
		loginModel.setPwd("123");
		return loginModel;
	}
	

}
