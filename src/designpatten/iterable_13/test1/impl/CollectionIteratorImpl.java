package designpatten.iterable_13.test1.impl;

import designpatten.iterable_13.test1.Iterator;
import designpatten.iterable_13.test1.PayMangerA;

//�������� Collection ���ϵĵ������ӿ� 
public class CollectionIteratorImpl implements Iterator{

	//�ۺ϶���
	private PayMangerA aggregate = null;
	//λ��
	private int index = -1;
	
	
	public CollectionIteratorImpl(PayMangerA aggregate){
		this.aggregate = aggregate;
	}
	
	
	
	@Override
	public void first() {
		index = 0;
	}

	
	@Override
	public void next() {
       if(index < this.aggregate.size()){
    	   index = index +1;
       }		
	}
	

	@Override
	public boolean isDone() {
		if(index == this.aggregate.size()){
			return true;
		}
		return false;
	}

	
	@Override
	public Object currentItem() {
		return this.aggregate.get(index);
	}
	
}
