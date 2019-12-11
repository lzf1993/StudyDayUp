package designpatten.iterable_13.test1;


import designpatten.iterable_13.test1.impl.ArrayIteratorImpl;
import designpatten.iterable_13.test1.model.PayModel;

//��˾���еĹ��ʹ������ -- �ۺ϶���
public class PayMangerB extends Aggregate{

	//���������洢
	private PayModel[] list = null;


	//��ȡ�����б�
	public PayModel[] getPays(){
		return list;
	}
	

	public int size(){
		return list.length;
	}

	
	public PayModel get(int index){
		return list[index];
	}



	//���㹤��
	public void calcPay(){
		PayModel model1 = new PayModel();	
		model1.setName("����");
		model1.setPay(5000);
		
		PayModel model2 = new PayModel();	
		model2.setName("����");
		model2.setPay(4500);
		

		PayModel model3 = new PayModel();	
		model3.setName("����");
		model3.setPay(6500);
		
		list = new PayModel[3];
		list[0] = model1;
		list[1] = model2;
		list[2] = model3;
	}


	@Override
	public Iterator createIterator() {
		return new ArrayIteratorImpl(this);
	}
}
