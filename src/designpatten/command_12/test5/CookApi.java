package designpatten.command_12.test5;

import java.io.Serializable;

//��ʦ�ӿ� -- ����
public interface CookApi extends Serializable{
	

	/**
	 * ����
	 * @param name        ����
	 * @param tableNum    ��λ��
	 */
	public void cook(String name, int tableNum);
	
	public int getNum();

}
