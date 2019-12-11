package designpatten.flvweight_19.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//��ȫ����
public class SecurityMgr {
  
	private static SecurityMgr sgr = new SecurityMgr();
	
	public static SecurityMgr getInstance(){
		return sgr;
	}
	
	
	//�����ڼ䣬������ŵ�¼��Ա��Ӧ��Ȩ�ޣ���webӦ�ã���Щ����ͨ�������session��
	private Map<String,Collection<AuthorizationModel>> map = new HashMap<>();
	
	
	
	//���е�¼����
	public void login(String user){
		Collection<AuthorizationModel> col =queryByUser(user);
		map.put(user, col);
	}
	
	
	//�ж�ĳ���û��Ƿ���Ȩ��
	public boolean hasPermit(String user,String securityEntity,String permit){
		Collection<AuthorizationModel> col = map.get(user);
		if(col == null || col.size() == 0){
			System.out.println(user+"û�е�¼������û�з����κ�Ȩ��");
			return false;
		}
		for(AuthorizationModel a:col){
		  System.out.println("a == "+a);
		  if(a.getSecurityEntity().equals(securityEntity) && a.getPermit().equals(permit)){
			  return true;
		  }
		}
		return false;
	}
	
	
	
	//ģ������ݿ��ѯĳ���˵�Ȩ��
	private Collection<AuthorizationModel> queryByUser(String user){
		Collection<AuthorizationModel> col = new ArrayList<AuthorizationModel>();
		for(String s:TestDB.colDB){
			String ss[] = s.split(",");
			if(ss[0].equals(user)){
				//�鵽һ��������һ������ - һ����¼����һ������ �� ����ʹ�������
				//���������ڴ��У�ռ�õ��ڴ�ͺܴ��ˣ�������ݿ���һ������¼�����ڴ���һ�����󣬵����ж඼�ǲ���Ҫ�Ŀ���
				AuthorizationModel model = new AuthorizationModel();
				model.setUser(ss[0]);
				model.setSecurityEntity(ss[1]);
				model.setPermit(ss[2]);
				col.add(model);
			}
		}
		return col;
	}
	
	
	
	
	
	
	
}
