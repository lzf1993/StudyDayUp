package designpatten.templatemethod_15.explain.normal;

import designpatten.templatemethod_15.explain.normal.model.LoginModel;
import designpatten.templatemethod_15.explain.normal.model.UserModel;

//��ͨ��¼����
public class NormalLogin {

	
	//���е�½����
	public boolean login(LoginModel lm){
		//�����ݿ��ȡ�û���Ϣ
		UserModel um = findUserByUserId(lm.getUserId());
		if(um!=null){
			if(um.getUserId().equals(lm.getUserId()) && um.getPwd().equals(lm.getPwd())){
				return true;
			}
		}
		return false;
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
