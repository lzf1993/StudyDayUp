package designpatten.command_12.test4;

import designpatten.command_12.test4.bean.Food;

//����ӿ�
public interface Command {

	
	//ִ������
	public void execute();
	
	
	//���ó�ʦ
	public void setCookApi(CookApi cookApi);
	
	
	//��ȡ��λ��
	public int getTableNum();
	
	
	//��ȡ�˵�����
	public Food getFood();
}
