package designpatten.state_17.test3.impl;

import designpatten.state_17.test3.DaoManger;
import designpatten.state_17.test3.State;
import designpatten.state_17.test3.VoteManger;
import designpatten.state_17.test3.VoteState;



//1������ͶƱ״̬
public class NormalVoteState implements VoteState{

	@Override
	public void vote(String user, String voteItem, VoteManger voteManger) {
		//����ͶƱ����¼��ͶƱ��¼
		voteManger.getMapVote().put(user, voteItem);
		//�����һ��״̬������ͶƱ��ɣ���һ��ͶƱ���ظ���
		DaoManger.update(user, State.REPEAT);
		System.out.println("��ϲ'"+user+"',��ͶƱ�ɹ�");
	}

}
