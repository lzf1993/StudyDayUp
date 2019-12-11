package designpatten.mediator_9.test2.dao;

import designpatten.mediator_9.test2.DepUserMediatorImpl;

//����
public class Dep {

	//����id
	private String depId;	

	//��������
	private String depName;

	public String getDepId() {
		return depId;
	}

	public void setDepId(String depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	
	//��������
	public boolean deleteDep(){
		DepUserMediatorImpl.getInstance().deleteDep(depId);
		return true;
	}

}
