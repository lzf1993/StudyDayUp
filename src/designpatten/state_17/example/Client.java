package designpatten.state_17.example;

public class Client {

	
	public static void main(String args[]){
		
		VoteManager vm = new VoteManager();
		for(int i=0;i<9;i++){
			vm.vote("u1", "A");
		}
		
	}
}
