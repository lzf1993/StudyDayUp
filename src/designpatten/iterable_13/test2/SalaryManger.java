package designpatten.iterable_13.test2;

import designpatten.iterable_13.javautil.model.PayModel;

public class SalaryManger {

	
	private PayModel [] pms = null;
	
	
	public PayModel[] getPays(){
		return pms;
	}
	
	
	//���㹤��
	public void calcPay(){		
		int len = 15;
		pms = new PayModel[len];
		for(int i=0;i<len;i++){
			PayModel model1 = new PayModel();	
			model1.setName("����"+i);
			model1.setPay(5000+i);
			pms[i] = model1;
		}
	}

	
	public AggregationIterator createIterator(){
		return new ArrayIteratorImpl(this);
	}
	
}
