package designpatten.visitor_24.test2.impl;

import java.util.ArrayList;
import java.util.List;

import designpatten.visitor_24.test2.Component;
import designpatten.visitor_24.test2.Visitor;


//��϶���
public class Composite extends Component{

	//��϶��������
	private String name = "";
	
	//�洢��϶����е����������
	private List<Component> childComponents = new ArrayList<>();
	
	
	public Composite(String name){
		this.name = name;
	}
	
	
	public String getName(){
		return this.name;
	}
	
	
	@Override
	public void addChild(Component child) {
		childComponents.add(child);
	}
	
	
	public List<Component> getChildComponents() {
		return childComponents;
	} 
	
	
	@Override
	public void accept(Visitor visitor) {
		//�ص������߶������Ӧ�������൱������µĹ�����
		visitor.visitComposite(this);
		for(Component c:childComponents){
			//�����Ӷ�����շ��ʣ�����ʵ�ֵݹ�
			c.accept(visitor);
		}
	}

}
