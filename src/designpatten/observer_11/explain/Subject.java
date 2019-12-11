package designpatten.observer_11.explain;

import java.util.ArrayList;
import java.util.List;


//Ŀ����� -- ���۲��ߣ� ֪���۲����Ķ��󣬵������ͱ仯����֪ͨ�۲���
public class Subject {
 
	
	//��������ע��Ĺ۲��߶���
	private List<Observer> observers = new ArrayList<Observer>();
	
	
	
	//ע��۲���
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	
	//ɾ���۲���
	public void detach(Observer observer){
		observers.remove(observer);		
	}
	
	
    //֪ͨ�۲���
	public void notifiObserver(){
		if(observers.size() == 0){
			return;
		}
		for(Observer observer:observers){
			observer.update(this);
		}
	}
	
}
