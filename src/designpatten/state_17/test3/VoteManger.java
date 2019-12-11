package designpatten.state_17.test3;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import designpatten.state_17.test3.VoteState;


//ͶƱ����
public class VoteManger {


	//����״̬����
	private VoteState state;

	//��¼�û�ͶƱ����� �û����� - ͶƱѡ��
	private Map<String,String> mapVote = new HashMap<String,String>();

	//��¼�û�ͶƱ�������û����� - ͶƱ����
	private Map<String,Integer> mapVoteCount = new HashMap<String, Integer>();


	//��ȡͶƱ���
	public Map<String,String> getMapVote(){
		return mapVote;
	}



	//��ȡͶƱ����
	public Map<String,Integer> getMapVoteCount(){
		return mapVoteCount;
	}





	//ͶƱ
	public void vote(String user,String voteItem){
		Integer oldVoteCount = mapVoteCount.get(user);
		if(oldVoteCount == null){
			oldVoteCount = 0;
		}
		oldVoteCount = oldVoteCount+1;
		mapVoteCount.put(user, oldVoteCount);
		//��ȡ��ǰ״̬,����״̬�������
		State s = DaoManger.get(user);
		state = createState(s);;

		//ִ�е�ǰ״̬
		state.vote(user, voteItem, this);
	}



	//1���ļ��ж�ȡ��������ͨ�����䴴��ʵ���࣬���������µ��࣬����ÿ������µ��ж�
	public VoteState createState(State state){
		Properties properties = new Properties();
		InputStream inputStream = null;
		try {
			inputStream = VoteManger.class.getResourceAsStream("state.properties");
			if(inputStream!=null){
				properties.load(inputStream);
			}
		} catch (IOException e) {
			System.out.println("װ�س���... e: "+e);
			e.printStackTrace();
		}finally {
			try {
				if(inputStream!=null){
					inputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		//��ȡ�����ļ�����ȡ���е�����
		Iterator<String> it=properties.stringPropertyNames().iterator();
		String className = "";
		while(it.hasNext()){
			String key=it.next();
			if(state.getName().equals(key)){
				className = properties.getProperty(key);
				break;
			}
		}
		return newInstance(className);
	}




	//�������ַ������
	private VoteState newInstance(String className){
		VoteState s = null;
		try {
			s = (VoteState) Class.forName(className).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return s;
	}



}
