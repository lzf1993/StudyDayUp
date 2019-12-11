package designpatten.chainOfReson_22.example;

public class Client {
	
	public static void main(String args[]){
		
		FeeRequest request = new FeeRequest();
		
		//��ʼ����
		String re1 = request.requestToProjectManger("С��", 300);
		System.out.println("the re1 = "+re1);
		String re2 = request.requestToProjectManger("С��", 300);
		System.out.println("the re2 = "+re2);
		
		
		String re3 = request.requestToProjectManger("С��", 600);
		System.out.println("the re3 = "+re3);
		String re4 = request.requestToProjectManger("С��", 600);
		System.out.println("the re4 = "+re4);
		
		
		String re5 = request.requestToProjectManger("С��", 1300);
		System.out.println("the re5 = "+re5);
		String re6 = request.requestToProjectManger("С��", 1300);
		System.out.println("the re6 = "+re6);
		
	}

}
