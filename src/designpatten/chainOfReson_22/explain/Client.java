package designpatten.chainOfReson_22.explain;

public class Client {

	public static void main(String agr[]){
		Handler h1 = new ConcreteHandler1();
		Handler h2 = new ConcreteHandler2();
		
		h1.setHandler(h2);
		h1.handleRequest();
		
		
	}
	
}
