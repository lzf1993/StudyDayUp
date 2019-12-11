package designpatten.state_17.test2;

import java.util.HashMap;
import java.util.Map;

import designpatten.state_17.test2.impl.NormalVoteState;


//ͶƱ����
public class VoteManger {


	//����״̬����
	private VoteState state;

	private Map<String,VoteState> mapState = new HashMap<String,VoteState>();

	//��¼�û�ͶƱ����� �û����� - ͶƱѡ��
	private Map<String,String> mapVote = new HashMap<String,String>();

	//��¼�û�ͶƱ�������û����� - ͶƱ����
	private Map<String,Integer> mapVoteCount = new HashMap<String, Integer>();


	//��ȡͶƱ���
	public Map<String,String> getMapVote(){
		return mapVote;
	}


	//��ȡͶƱ״̬
	public Map<String,VoteState> getMapState(){
		return mapState;
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
		//��ȡ��ǰ״̬����
		VoteState state = mapState.get(user);
		if(state == null){
			state = new NormalVoteState();
		}
		//ִ�е�ǰ״̬
		state.vote(user, voteItem, this);
	}


}
