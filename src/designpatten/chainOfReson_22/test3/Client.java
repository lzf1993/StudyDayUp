package designpatten.chainOfReson_22.test3;

public class Client {

	
	public static void main(String agrs[]){
		//����ҵ�����
		GoodsSaleEbo ebo = new GoodsSaleEbo();
		
		//׼����������
		SaleModel saleModel = new SaleModel();
		saleModel.setGoods("��ѧ�ѻ��ɾ���");
		saleModel.setSaleNum(10);
		
		//����ҵ����
		ebo.sale("С��", "����", saleModel);
		System.out.println("-------------------");
		ebo.sale("С��", "����", saleModel);
	}
}
