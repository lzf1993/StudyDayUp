package designpatten.state_17.test1;

import java.util.HashMap;
import java.util.Map;

import designpatten.state_17.test1.impl.BlackVoteState;
import designpatten.state_17.test1.impl.NormalVoteState;
import designpatten.state_17.test1.impl.RepeatVoteState;
import designpatten.state_17.test1.impl.SpiteVoteState;

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
	
	
	//ͶƱ
	public void vote(String user,String voteItem){
		Integer oldVoteCount = mapVoteCount.get(user);
		if(oldVoteCount == null){
			oldVoteCount = 0;
		}
		oldVoteCount = oldVoteCount+1;
		mapVoteCount.put(user, oldVoteCount);
		if(oldVoteCount == 1){ //����ͶƱ
			state = new NormalVoteState();
		}
		else if(oldVoteCount>1 && oldVoteCount<5){
			state = new RepeatVoteState();
		}
		else if(oldVoteCount>=5 && oldVoteCount<8){
			state = new BlackVoteState();
		}
		else if(oldVoteCount>=8){
			state = new SpiteVoteState();
		}
		state.vote(user, voteItem, this);
	}
	
	
}
