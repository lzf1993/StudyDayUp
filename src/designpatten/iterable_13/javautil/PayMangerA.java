package designpatten.iterable_13.javautil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import designpatten.iterable_13.javautil.model.PayModel;




public class PayMangerA extends Aggregate{

	//�ü������洢
	private List<PayModel> list = new ArrayList<PayModel>();



	//��ȡ�����б�
	public List<PayModel> getPayList(){
		return list;
	}
	
	
	public int size(){
		return list.size();
	}
	
	
	public PayModel get(int index){
		return list.get(index);
	}


	//���㹤��
	public void calcPay(){
		
		PayModel model1 = new PayModel();	
		model1.setName("����");
		model1.setPay(3000);
		
		PayModel model2 = new PayModel();	
		model2.setName("����");
		model2.setPay(4000);
		
		PayModel model3 = new PayModel();	
		model3.setName("С��");
		model3.setPay(7000);
		
		PayModel model4 = new PayModel();	
		model4.setName("С��");
		model4.setPay(2300);
		
		PayModel model5 = new PayModel();	
		model5.setName("С��");
		model5.setPay(9300);
		
		
		list.add(model1);
		list.add(model2);
		list.add(model3);
		list.add(model4);
		list.add(model5);
		
	}


	//ֱ��ʹ�ü��ϴ����еĵ�����
	@Override
	public Iterator createIterator() {
		return list.iterator();
	}


	
}
