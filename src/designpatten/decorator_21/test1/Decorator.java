package designpatten.decorator_21.test1;

import java.util.Date;


//װ��������
public abstract class Decorator extends Component{

	//���б�װ�ε��������
	private Component c;
	
	public Decorator(Component c){
		this.c = c;
	}
	
	
	//�����������ķ��� 
	@Override
	public double calcPrize(String user, Date begin, Date end) {
		return c.calcPrize(user, begin, end);
	}
	
	
}
