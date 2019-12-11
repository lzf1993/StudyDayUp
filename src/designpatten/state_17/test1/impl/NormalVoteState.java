package designpatten.state_17.test1.impl;

import designpatten.state_17.test1.VoteManger;
import designpatten.state_17.test1.VoteState;



//����ͶƱ״̬
public class NormalVoteState implements VoteState{

	@Override
	public void vote(String user, String voteItem, VoteManger voteManger) {
		voteManger.getMapVote().put(user, voteItem);
		System.out.println("��ϲ��ͶƱ�ɹ�");
	}

}
