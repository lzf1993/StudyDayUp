package designpatten.state_17.test1.impl;

import designpatten.state_17.test1.VoteManger;
import designpatten.state_17.test1.VoteState;

//����������
public class BlackVoteState implements VoteState{

	@Override
	public void vote(String user, String voteItem, VoteManger voteManger) {
         System.out.println("���������������ֹ��½��ʹ�ñ�ϵͳ");		
	}

}
