package designpatten.iterable_13.javautil.impl;

import java.util.Iterator;

import designpatten.iterable_13.javautil.PayMangerB;


//�������ľۺ϶��� ʵ�ֵ�����
//����ʹ��java��ܵĵ�����
public class ArrayIteratorImpl implements Iterator{

	private PayMangerB manger;

	private int index = 0;

	public ArrayIteratorImpl(PayMangerB manger){
		this.manger = manger;	
	}



	@Override
	public boolean hasNext() {
		if(manger!=null && index<manger.size()){
			return true;
		}
		return false;
	}
	

	@Override
	public Object next() {
		Object obj = null;
		if(hasNext()){
			obj = manger.get(index);
			index ++;
		}
		
		return obj;
	}

}
