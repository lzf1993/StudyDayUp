package designpatten.state_17.test2.impl;

import designpatten.state_17.test2.VoteManger;
import designpatten.state_17.test2.VoteState;


//4������һ���µĹ��� 8 -10 �κ�������������ٷ������������
public class BlankWarnVotate implements VoteState{

	@Override
	public void vote(String user, String voteItem, VoteManger voteManger) {
		//����7���ظ�ͶƱ,�����������
		if(voteManger.getMapVoteCount().get(user)>=9){
			voteManger.getMapState().put(user, new BlackVoteState());
		}
		System.out.println("��ֹ��½��ʹ��ϵͳ3��");
	}

}
