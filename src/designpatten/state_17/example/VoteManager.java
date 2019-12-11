package designpatten.state_17.example;

import java.util.HashMap;
import java.util.Map;

//ͶƱ����
public class VoteManager {

	//��¼�û�ͶƱ�Ľ���� �û����� - ͶƱ���
	private Map<String,String> mapVote = new HashMap<String,String>();

	//��¼�û�ͶƱ������ �û����� - ͶƱ����
	private Map<String,Integer> mapVoteCount = new HashMap<>();
	
	
	
	public void vote(String user,String voteItem){
		//�Ȼ�ȡͶƱ��¼�������Ӵ���
		Integer oldVoteCount = mapVoteCount.get(user);
		if(oldVoteCount == null){
			oldVoteCount = 0;
		}
		oldVoteCount = oldVoteCount+1;
		mapVoteCount.put(user, oldVoteCount);
		
		if(oldVoteCount == 1){ //����ͶƱ
			mapVote.put(user, voteItem);
			System.out.println("��ϲ��ͶƱ�ɹ���");
		}
		else if(oldVoteCount>1 && oldVoteCount<5){
			System.out.println("�벻Ҫ�ظ�ͶƱ��");
		}
		else if(oldVoteCount>=5 && oldVoteCount<8){
			String s = mapVote.get(user);
			if(s!=null){
				mapVote.remove(user);
			}
			System.out.println("���ж���ˢƱ��Ϊ��ȡ��Ͷ���ʸ�");
		}
		else if(oldVoteCount>=8){
			System.out.println("���������������ֹ��½��ʹ�ñ�ϵͳ");
		}
		
	}
	
	
}
