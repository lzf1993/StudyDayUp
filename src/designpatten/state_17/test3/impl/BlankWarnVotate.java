package designpatten.state_17.test3.impl;

import designpatten.state_17.test3.DaoManger;
import designpatten.state_17.test3.State;
import designpatten.state_17.test3.VoteManger;
import designpatten.state_17.test3.VoteState;


//4������һ���µĹ��� 8 -10 �κ�������������ٷ������������
public class BlankWarnVotate implements VoteState{

	@Override
	public void vote(String user, String voteItem, VoteManger voteManger) {
		//����7���ظ�ͶƱ,�����������
		if(voteManger.getMapVoteCount().get(user)>=9){
			DaoManger.update(user, State.BLANK);
		}
		System.out.println("'"+user+"'������ֹ��½��ʹ��ϵͳ3��");
	}

}
