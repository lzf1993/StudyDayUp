package designpatten.templatemethod_15.explain.better;

import designpatten.templatemethod_15.explain.better.model.LoginModel;

/*
 * ��¼ģ��
 * ���ݵ�¼���̣�����㷨�Ǽ�:
 *   1��������¼��Աid,��ȡ��Ӧ����
 *   2�����ݵ�¼��Ա�������ȡ���ܺ�����룬�������Ҫ���ܣ���ֱ�ӷ���
 *   3���жϵ�¼��Ա��д���ݺ����ݿ������ݽ���ƥ��
*/
public abstract class LoginTemplate {

	
	
	//��¼���̣��ǹ̶���
	public final boolean login(LoginModel lm){
		//1����ȡ�û���Ϣ
		LoginModel dlm = findLoginUser(lm.getLoginId());
		if(dlm!=null){
			//2����ȡ���ܺ�����
			String encryptPwd = encryPwd(lm.getPwd());
			lm.setPwd(encryptPwd);
			//3��������֤
			return match(lm, dlm);
		}
		return false;
	}
	

	
	
	//1����ȡ��¼���û���Ϣ
	public abstract LoginModel findLoginUser(String loginId);
	
	
	
	//2���Ե�¼�û��������ݽ��м���
	public String encryPwd(String pwd){
		return pwd;
	}
	
	
	
	//3��������֤ �� �û�������û��� �� ���ݿ�洢���Ƿ�һ��
	public boolean match(LoginModel lm,LoginModel dblm){
		if(lm.getLoginId().equals(dblm.getLoginId()) &&
				lm.getPwd().equals(dblm.getPwd())){
			return true;
		}
		return false;
	}
	
}

