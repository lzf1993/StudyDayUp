package designpatten.mediator_9.test2;

import java.util.ArrayList;
import java.util.Collection;

import designpatten.mediator_9.test2.dao.Dep;
import designpatten.mediator_9.test2.dao.DepUserModel;
import designpatten.mediator_9.test2.dao.User;

public class DepUserMediatorImpl {
   
	private static DepUserMediatorImpl impl = new DepUserMediatorImpl();
	
	private Collection<DepUserModel>  depUserCol = new ArrayList<DepUserModel>();
	
	
	private DepUserMediatorImpl(){
		initTestData();
	}
	
	public static DepUserMediatorImpl getInstance(){
		return impl;
	}
	
	
	//��ʼ������
	private void initTestData(){
		for(int i=0;i<10;i++){
			DepUserModel model = new DepUserModel();
			model.setDepUserId("du"+i);
			model.setDepId("d"+i);
			model.setUserId("u"+i);
			depUserCol.add(model);
		}
	}
	
	
	//�������š���Ѹ����������صĹ�ϵȫ������
	public boolean deleteDep(String depId){
		Collection<DepUserModel> tempCol = new ArrayList<>();
		for(DepUserModel model:depUserCol){
			if(model.getDepId() .equals(depId)){
				tempCol.add(model);
			}
		}
		return depUserCol.removeAll(tempCol);
	}
	
	
    
	//��Ա��ְ�����������ص���Ϣȫ������
	public boolean deleteUser(String useId){
		Collection<DepUserModel> tempCol = new ArrayList<>();
		for(DepUserModel model:depUserCol){
			if(model.getUserId().equals(useId)){
				tempCol.add(model);
			}
		}
		return depUserCol.removeAll(tempCol);
	}
	
	
	//��ʾһ�����ŵ�������Ա
	public void showDepUser(Dep dep){
		for(DepUserModel model:depUserCol){
			if(model.getDepId() .equals(dep.getDepId())){
				System.out.println("���ű�� = "+dep.getDepId()+" ����������Ա�������ǣ� "+model.getUserId());
			}
		}
	}
	
	
	//��ʾһ���������Ĳ���
	public void showUserDeps(User user){
		for(DepUserModel model:depUserCol){
			if(model.getUserId().equals(user.getUserId())){
				System.out.println("��Ա��� = "+user.getUserId()+" �����Ĳ�����: "+model.getDepId());
			}
		}
	}
	
	
}
