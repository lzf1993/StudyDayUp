package designpatten.observer_11.myself;

import designpatten.observer_11.explain.Observer;
import designpatten.observer_11.explain.Subject;


//���� -- �۲���
public class Reader implements Observer{

	private String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//�յ���ֽ
	@Override
	public void update(Subject subject) {
		System.out.println("����["+name+"] �յ���ֽ�ˣ��Ķ����������ǣ� "+((NewsPaper)subject).getContent());
	}

}
