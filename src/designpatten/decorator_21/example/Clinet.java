package designpatten.decorator_21.example;

public class Clinet {

	
	public static void main(String args[]){
		
		//�ȴ������㽱��Ķ���
		Prize p = new Prize();
		
		
		double zs = p.calcPrize("����",null,null);
		System.out.println("======����Ӧ�ý���: "+zs);
		
		
		double zs1 = p.calcPrize("����",null,null);
		System.out.println("======����Ӧ�ý���: "+zs1);
		
		
		double zs2 = p.calcPrize("����",null,null);
		System.out.println("======����Ӧ�ý���: "+zs2);
		
		
	}
}
