package designpatten.strategy_16.test1.normal;



//����ģʽ�Ľ����ʽ�����ڵ����⡣�㷨�Ϳͻ��������һ��
public class Price {


    //�ۿ�
	public double quote(double goodsPrice , String customerType){
		if("��ͨ�ͻ�".equals(customerType)){
			return calcPriceNormal(goodsPrice);
		}else if("�Ͽͻ�".equals(customerType)){
			return calcPriceOld(goodsPrice);
		}else if("��ͻ�".equals(customerType)){
			return calcPriceLarge(goodsPrice);
		}
        return goodsPrice;
	}


    //��ͨ�ͻ��ۿ�
	private double calcPriceNormal(double goodsPrice){
		System.out.println("������ͨ�ͻ���û���ۿ�");
		return goodsPrice;
	}
	

	//�Ͽͻ��ۿ�
	private double calcPriceOld(double goodsPrice){
		System.out.println("�����Ͽͻ���ͳһ�ۿ�5%");
		return goodsPrice*(1-0.05);
	}

	
	//��ͻ��ۿ�
	private double calcPriceLarge(double goodsPrice){
		System.out.println("���ڴ�ͻ���ͳһ�ۿ�10%");
		return goodsPrice*(1-0.1);
	}
	
	
}
