package designpatten.state_17.test2;



public class Client {
	
	public static void main(String args[]){
		
		VoteManger vm = new VoteManger();
		for(int i=0;i<13;i++){
			vm.vote("u1", "A");
		}
		
	}
}
