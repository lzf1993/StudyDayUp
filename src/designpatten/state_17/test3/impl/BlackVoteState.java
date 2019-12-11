package designpatten.state_17.test3.impl;

import designpatten.state_17.test3.VoteManger;
import designpatten.state_17.test3.VoteState;

//4������������
public class BlackVoteState implements VoteState{

	@Override
	public void vote(String user, String voteItem, VoteManger voteManger) {
         System.out.println("'"+user+"',�����������������ֹ��½��ʹ�ñ�ϵͳ");		
	}

}
