package designpatten.iterable_13.test1.impl;

import designpatten.iterable_13.test1.Iterator;
import designpatten.iterable_13.test1.PayMangerB;

//���������
public class ArrayIteratorImpl implements Iterator{

	//�ۺ϶���
	private PayMangerB aggregate = null;
	//�±�
	private int index = -1;
	
	
	public ArrayIteratorImpl(PayMangerB aggregate){
		this.aggregate = aggregate;
	}
	
	
	@Override
	public void first() {
		index = 0;
	}

	@Override
	public void next() {
		if(index < aggregate.getPays().length){
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
