package designpatten.templatemethod_15.test2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client {

	
	public static void main(String args[]){
		
		UserModel model1 = new UserModel("u1", "user1", 22);
		UserModel model2 = new UserModel("u2", "user2", 21);
		UserModel model3 = new UserModel("u3", "user3", 22);
		UserModel model4 = new UserModel("u4", "user4", 10);
		UserModel model5 = new UserModel("u5", "user5", 25);
		UserModel model6 = new UserModel("u6", "user6", 20);
		
		List<UserModel> list = new ArrayList<UserModel>();
		list.add(model1);
		list.add(model2);
		list.add(model3);
		list.add(model4);
		list.add(model5);
		list.add(model6);
		System.out.println("����ǰ��");
		printf(list);
		
		Comparator c = new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				UserModel u1 = (UserModel) o1;
				UserModel u2 = (UserModel) o2;
				if(u1.getAge()>u2.getAge()){
					return 1;
				}else if(u1.getAge() == u2.getAge()){
					return 0;
				}else{
					return -1;
				}
			}
		};
		Collections.sort(list,c);
		System.out.println("�����");
		printf(list);
	}
	
	
	public static void printf(List<UserModel> ls){
		for(UserModel s:ls){
			System.out.println(s);
		}
	}
}
