package designpatten.state_17.test3;

import designpatten.state_17.test3.VoteManger;

public class Client {

	public static void main(String args[]){
		VoteManger vm = new VoteManger();
		for(int i=0;i<13;i++){
			vm.vote("u1", "A");
		}
		for(int i=0;i<3;i++){
			vm.vote("u2", "A");
		}
		for(int i=0;i<6;i++){
			vm.vote("u3", "A");
		}
		for(int i=0;i<2;i++){
			vm.vote("u4", "B");
		}
		for(int i=0;i<7;i++){
			vm.vote("u5", "A");
		}
	}
}
