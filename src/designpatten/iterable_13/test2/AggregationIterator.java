package designpatten.iterable_13.test2;

import java.util.Collection;

public interface AggregationIterator {
  
	//��ȡ���漸��Ԫ��
	public Collection next(int num);
	
	
	//�Ƿ�����һ��Ԫ��
	public boolean hasNext();
	
	
	//�Ƿ�����һ��Ԫ��
	public boolean hasPrevious();
	
	
	//��ȡ���漸��Ԫ��
	public Collection privious(int num);
	
}
