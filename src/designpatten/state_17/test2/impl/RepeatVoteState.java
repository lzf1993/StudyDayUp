package designpatten.state_17.test2.impl;

import designpatten.state_17.test2.VoteManger;
import designpatten.state_17.test2.VoteState;

//2���ظ�ͶƱ
public class RepeatVoteState implements VoteState{

	@Override
	public void vote(String user, String voteItem, VoteManger voteManger) {
		//�����Ĵ��ظ�ͶƱ�������ͶƱ�ˣ���¼��һ���Ƕ���ͶƱ
		if(voteManger.getMapVoteCount().get(user)>=4){
			voteManger.getMapState().put(user, new SpiteVoteState());
		}
		System.out.println("�벻Ҫ�ظ�ͶƱ");	
	}

}
