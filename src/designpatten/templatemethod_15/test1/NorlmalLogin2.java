package designpatten.templatemethod_15.test1;

import designpatten.templatemethod_15.explain.better.LoginTemplate;
import designpatten.templatemethod_15.explain.better.model.LoginModel;


//��¼��֤����������֤��ԭ��ֻҪ�û��������룬������Ҫ�ش�����
public class NorlmalLogin2 extends LoginTemplate{

	
	//��ȡ��¼��Ա��Ϣ
	@Override
	public LoginModel findLoginUser(String loginId) {
		NormalLoginModel lm = new NormalLoginModel();
		lm.setLoginId(loginId);
		lm.setPwd("test123");
		lm.setAnswer("testAnswer");
		lm.setQuestion("testQuestion");
		return lm;
	}
	
	
	//������֤
	@Override
	public boolean match(LoginModel lm, LoginModel dblm) {
		boolean flag = super.match(lm, dblm);
		if(flag){
			NormalLoginModel lm2 = (NormalLoginModel) lm;
			NormalLoginModel dblm2 = (NormalLoginModel) dblm;
			if(lm2.getQuestion().equals(dblm2.getQuestion()) &&
					lm2.getAnswer().equals(dblm2.getAnswer())){
				return true;
			} 
		}
		return false;
	}

}
