package designpatten.flvweight_19.test1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//Ȩ�޹�����
public class SecurityMgr {

	private static SecurityMgr mgr = new SecurityMgr();

	//�洢��user -> Ȩ�޼���
	// 1000���û�  ��Ԫ�ؾ�һ��1000��
	private Map<String,Collection<Flyweight>> map = new HashMap<String,Collection<Flyweight>>();

	private SecurityMgr(){

	}

	public static SecurityMgr getInstance(){
		return mgr;
	}



	//���е�¼ -- ��¼ʱ�Ͱ��û���ӵ�е�Ȩ�޴����ݿ���ȡ�������ŵ�������ȥ
	public void login(String user){
		//��¼�ɹ��󣬽���ѯ��Ȩ�޴洢���ڴ���
		Collection<Flyweight> col = queryByUser(user);
		map.put(user, col);
	}



	//�ж��Ƿ���Ȩ��
	public boolean hasPermit(String user,String securityEntity,String permit){
		//��ȡȨ��
		Collection<Flyweight> col = map.get(user);
		if(col == null || col.size() == 0){
			System.out.println(user+"û�е�¼������û�б������κ�Ȩ��");
			return false;
		}

		for(Flyweight fm:col){
			System.out.println("fm == "+fm);
			if(fm.match(securityEntity, permit)){ 
				return true; 
			}
		}
		return false;
	}



	//�����ݿ��ѯĳ����ӵ�е�Ȩ��
	private Collection<Flyweight> queryByUser(String user){
		Collection<Flyweight> col = new ArrayList<>();
		for(String s:TestDB.colDB){
			String ss[] = s.split(",");
            if(ss[0].equals(user)){
            	Flyweight fm = FlyweightFactory.getInstance().getFlyweight(ss[1]+","+ss[2]);
            	col.add(fm);
            }
		}
		return col;
	}


}
