package designpatten.visitor_24.test2.impl;

import designpatten.visitor_24.test2.Component;
import designpatten.visitor_24.test2.Visitor;

//Ҷ�Ӷ���
public class Leaf extends Component{

	//Ҷ�Ӷ��������
	private String name = "";
	
	
	public Leaf(String name){
		this.name = name ;
	}
		
	public String getName(){
		return this.name;
	}
	
	
	//Ҷ�Ӷ�����շ��ʣ��������������µĹ���
	@Override
	public void accept(Visitor visitor) {
		visitor.visitLeaf(this);
	}

}
