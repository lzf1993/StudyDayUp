package designpatten.mediator_9.test2.dao;

import designpatten.mediator_9.test2.DepUserMediatorImpl;

//��Ա
public class User {
   
	//id
	private String userId;
	
	
	//��Ա����
	private String userName;


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	//��Ա��ְ
	public boolean dimisson(){
		DepUserMediatorImpl.getInstance().deleteUser(userId);
		return true;
	}
	
	
	
	
}
