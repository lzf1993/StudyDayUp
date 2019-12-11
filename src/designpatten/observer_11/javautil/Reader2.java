package designpatten.observer_11.javautil;

import java.util.Observable;
import java.util.Observer;


//���� -- �۲���
public class Reader2 implements Observer{

	private String name;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		NewsPaper2 paper = (NewsPaper2) o;
		System.out.println("���ߡ�"+name+"�� �յ���ֽ�ˣ�������: "+paper.getContent());
	}

}
