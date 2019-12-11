package designpatten.state_17.test3.impl;

import designpatten.state_17.test3.DaoManger;
import designpatten.state_17.test3.State;
import designpatten.state_17.test3.VoteManger;
import designpatten.state_17.test3.VoteState;

//2���ظ�ͶƱ
public class RepeatVoteState implements VoteState{

	@Override
	public void vote(String user, String voteItem, VoteManger voteManger) {
		//�����Ĵ��ظ�ͶƱ�������ͶƱ�ˣ���¼��һ���Ƕ���ͶƱ
		if(voteManger.getMapVoteCount().get(user)>=4){
			DaoManger.update(user, State.SPITE);
		}
		System.out.println("'"+user+"'�벻Ҫ�ظ�ͶƱ");	
	}

}
