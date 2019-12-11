package designpatten.state_17.test3;

import java.util.HashMap;
import java.util.Map;


//ģ�����ݿ�
public class DaoManger {

	//��¼�û���״̬
	private static Map<String,State> stateMap = new HashMap<String,State>();



	//�������
	public static void update(String user,State state){
		stateMap.put(user, state);		
	}


	//��ȡ����
	public static State get(String user){
		State state = stateMap.get(user);
		if(state == null){
			state = State.NORMAL;
		}
		return state;		
	}

}
