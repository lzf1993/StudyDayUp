package designpatten.state_17.test1.impl;

import designpatten.state_17.test1.VoteManger;
import designpatten.state_17.test1.VoteState;

//����ͶƱ
public class SpiteVoteState implements VoteState{

	@Override
	public void vote(String user, String voteItem, VoteManger voteManger) {
		String s = voteManger.getMapVote().get(user);
		if(s!=null){
			voteManger.getMapVote().remove(s);
		}
		System.out.println("���ж���ˢƱ��Ϊ��ȡ��ͶƱ�ʸ�");		
	}

}
