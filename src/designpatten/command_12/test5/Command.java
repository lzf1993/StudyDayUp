package designpatten.command_12.test5;

import java.io.Serializable;

import designpatten.command_12.test5.bean.Food;

//����ӿ�
public interface Command extends Serializable{
	
	
	//ִ������
	public void excute();
	
	
	//���ý����� -- ��ʦ
	public void setCook(CookApi cookApi);
	
		
	//��ȡ��λ��
	public int getTableNum();
	
	
	//��ȡ��Ĳ�
	public Food getFood();

}
