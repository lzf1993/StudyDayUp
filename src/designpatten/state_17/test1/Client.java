package designpatten.state_17.test1;

import designpatten.state_17.example.VoteManager;

public class Client {
	
	public static void main(String args[]){
		
		VoteManager vm = new VoteManager();
		for(int i=0;i<9;i++){
			vm.vote("u1", "A");
		}
		
	}
}
