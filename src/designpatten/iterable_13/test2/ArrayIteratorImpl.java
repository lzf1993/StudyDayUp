package designpatten.iterable_13.test2;

import java.util.ArrayList;
import java.util.Collection;

import designpatten.iterable_13.javautil.model.PayModel;

public class ArrayIteratorImpl implements AggregationIterator{
	
	private PayModel [] pms = null;
	private int index = 0;
	
	public ArrayIteratorImpl(SalaryManger manger){
		this.pms = manger.getPays();
	}
	

	@Override
	public Collection next(int num) {
		Collection<PayModel> col = new ArrayList<>();
		int cout = 0;
		while(hasNext() && cout < num){
			col.add(pms[index]);
			index ++;
			cout ++;
		}
		return col;
	}
	
	

	@Override
	public boolean hasNext() {
		if(pms!=null && index <=(pms.length-1)){
			return true;
		}
		return false;
	}

	
	
	@Override
	public boolean hasPrevious(){
		if(pms!=null && index>0){
			return true;
		}
		return false;
	}

	
	@Override
	public Collection privious(int num) {
		Collection<PayModel> col = new ArrayList<>();
		int cout = 0;
		index = index - num; //���ʼλ��
		while(hasNext() && cout < num){
			col.add(pms[index]);
			index ++;
			cout ++;
		}
		return col;
	}

}
