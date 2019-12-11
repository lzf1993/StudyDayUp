package designpatten.flvweight_19.test3;



//������Ԫ���󻺴�����ö���
public class CacheConfModel {


	//���濪ʼ��ʱ�Ŀ�ʼʱ��
	private long beginTime;
	
	
	//���建���������ʹ��ʱ�䣺������󿪷ŵĳ���ʱ��
	private double durableTime;
	
	
	//��������Ƿ���Ҫ�����û��� -- 
	private boolean forever;


	public long getBeginTime() {
		return beginTime;
	}


	public void setBeginTime(long beginTime) {
		this.beginTime = beginTime;
	}


	public double getDurableTime() {
		return durableTime;
	}


	public void setDurableTime(double durableTime) {
		this.durableTime = durableTime;
	}


	public boolean isForever() {
		return forever;
	}


	public void setForever(boolean forever) {
		this.forever = forever;
	}
	
}
