package designpatten.iterable_13.explain;



//�������ӿ�
public interface Iterator {

	
	//�ƶ��ۺ϶��󵽵�һ��λ��
	public void first();
	
	
	//�ƶ����ۺ϶�����һ��λ��
	public void next();
	
	
	//�Ƿ��ƶ����ۺ϶������һ��Ԫ��
	public boolean isDone();
	

	//��ȡ��������ǰ��Ԫ��
	public Object currentItem();
	
}
