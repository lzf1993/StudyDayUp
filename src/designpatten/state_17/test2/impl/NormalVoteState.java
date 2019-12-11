package designpatten.state_17.test2.impl;

import designpatten.state_17.test2.VoteManger;
import designpatten.state_17.test2.VoteState;



//1������ͶƱ״̬
public class NormalVoteState implements VoteState{

	@Override
	public void vote(String user, String voteItem, VoteManger voteManger) {
		//����ͶƱ����¼��ͶƱ��¼
		voteManger.getMapVote().put(user, voteItem);
		//�����һ��״̬������ͶƱ��ɣ���һ��ͶƱ���ظ���
		voteManger.getMapState().put(user, new RepeatVoteState());
		System.out.println("��ϲ��ͶƱ�ɹ�");
	}

}
