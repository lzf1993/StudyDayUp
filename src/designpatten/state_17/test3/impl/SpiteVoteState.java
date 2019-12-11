package designpatten.state_17.test3.impl;

import designpatten.state_17.test3.DaoManger;
import designpatten.state_17.test3.State;
import designpatten.state_17.test3.VoteManger;
import designpatten.state_17.test3.VoteState;

//3������ͶƱ
public class SpiteVoteState implements VoteState{

	@Override
	public void vote(String user, String voteItem, VoteManger voteManger) {
		String s = voteManger.getMapVote().get(user);
		if(s!=null){
			voteManger.getMapVote().remove(s);
		}
		//����7���ظ�ͶƱ,�����������
		if(voteManger.getMapVoteCount().get(user)>=7){
			DaoManger.update(user, State.BLANKWARN);
		}
		System.out.println("'"+user+"'���ж���ˢƱ��Ϊ��ȡ��ͶƱ�ʸ�");		
	}

}
