package designpatten.state_17.test2.impl;

import designpatten.state_17.test2.VoteManger;
import designpatten.state_17.test2.VoteState;

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
			voteManger.getMapState().put(user, new BlankWarnVotate());
		}
		System.out.println("���ж���ˢƱ��Ϊ��ȡ��ͶƱ�ʸ�");		
	}

}
