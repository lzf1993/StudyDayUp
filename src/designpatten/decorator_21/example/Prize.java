package designpatten.decorator_21.example;

import java.util.Date;

//���㽱��Ķ���
public class Prize {
	
	/**
	 * ����ĳ����ĳ��ʱ���ڵĽ�����Щ��������ʾ�в�����ʹ��
	 * @param user  �����㽱�����Ա
	 * @param begin ���㽱��Ŀ�ʼʱ��
	 * @param end  ���㽱��Ľ���ʱ��
	 * @return ĳ����ĳ��ʱ���ڵĽ���
	 */ 
	public double calcPrize(String user,Date begin,Date end){
		double prize = 0.0;
		//���㵱��ҵ�񽱽������˶������
		prize = this.monthPrize(user, begin, end);
		//�����ۼƽ���
		prize = prize + this.sumPrize(user, begin, end);
		//�����ҵ���������Ŷӽ���
		if(this.isManager(user)){
			prize = prize + this.groupPrize(user, begin, end);
		}
		return prize;
	}

	
	/**
	 * ����ĳ�˵ĵ���ҵ�񽱽�
	 * @param user  �����㽱�����Ա
	 * @param begin ���㽱��Ŀ�ʼʱ��
	 * @param end  ���㽱��Ľ���ʱ��
	 * @return ĳ����ĳ��ʱ���ڵĽ���
	 */ 
	public double monthPrize(String user,Date begin,Date end){
		//���㵱��ĳ����ҵ�񽱽𣬰�����Ա��ȡ���µ�ҵ��Ȼ���ٳ���3%
		double prize = TempDB.mapMonthSaleMoney.get(user)*0.03;
		System.out.println(user+"����ҵ�񽱽�"+prize);
		return prize;
	}
	
	
	
	/**
	 * ����ĳ�˵��ۼƽ���  = �ۼ�ҵ��� * ����
	 * @param user  �����㽱�����Ա
	 * @param begin ���㽱��Ŀ�ʼʱ��
	 * @param end  ���㽱��Ľ���ʱ��
	 * @return ĳ����ĳ��ʱ���ڵĽ���
	 */ 
	public double sumPrize(String user,Date begin,Date end){
		//Ĭ�ϴ�ҵ�ҵ���� 100000
		double prize = 100000 * 0.001;
		System.out.println(user+"�ۼƽ���"+prize);		
		return prize;
	}
	
	
	
	
	
	/**
	 * �ж���Ա����ͨ��Ա����ҵ����
	 * @param user ���ж���Ա
	 * @return true ��ʾ��ҵ����  false ��ʾ����ͨ��Ա
	 */
	private boolean isManager(String user){
		//Ϊ�˼򵥡�ֻ�������Ǿ���
		if("����".equals(user)){
			return true;
		}
		return false;
	}
	
	
	
	/**
	 * ���㵱���Ŷ�ҵ��
	 * @param user
	 * @param begin
	 * @param end
	 * @return
	 */
	private double groupPrize(String user,Date begin,Date end){
		//���㵱���Ŷ�ҵ�񽱽��ȼ�����Ŷ��ܵ�ҵ��Ȼ����� 1%
		double group = 0.0;
		//������һ���Ŷӵ�
		for(double d:TempDB.mapMonthSaleMoney.values()){
			group = group+d;
		}
		double prize = group * 0.01;
		System.out.println(user+" �����Ŷ�ҵ�񽱽�"+prize);
		return prize;
	}
	
	
}
