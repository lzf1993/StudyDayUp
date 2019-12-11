package designpatten.state_17.test2.impl;

import designpatten.state_17.test2.VoteManger;
import designpatten.state_17.test2.VoteState;

//4������������
public class BlackVoteState implements VoteState{

	@Override
	public void vote(String user, String voteItem, VoteManger voteManger) {
         System.out.println("���������������ֹ��½��ʹ�ñ�ϵͳ");		
	}

}
