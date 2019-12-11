package designpatten.templatemethod_15.explain.normal;

import designpatten.templatemethod_15.explain.normal.model.UserModel;
import designpatten.templatemethod_15.explain.normal.model2.LoginModel;

//������Ա��½
public class WorkerLogin {

	
	//���е�½����
	public boolean login(LoginModel lm){
		//�����ݿ��ȡ�û���Ϣ
		UserModel um = findUserByUserId(lm.getWorkerId());
		if(um!=null){
			String pwd = encryptPwd(lm.getPwd());
			if(um.getUserId().equals(lm.getWorkerId()) && um.getPwd().equals(pwd)){
				return true;
			}
		}
		return false;
	}
	
	
	//��������м���
	private String encryptPwd(String pwd){
		return pwd;
	}
	
	
	//�����û���Ϣ
	private UserModel findUserByUserId(String userId){
		UserModel um = new UserModel();
		um.setUid(userId);
		um.setName("test");
		um.setPwd("test");
		um.setUid("user001");
		return um;
	}
}
