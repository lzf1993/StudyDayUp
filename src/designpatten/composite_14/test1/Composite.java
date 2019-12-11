package designpatten.composite_14.test1;

import java.util.ArrayList;
import java.util.List;



public class Composite extends Component{


	private String name;
	private List<Component> childComponents = null;


	public Composite(String name) {
		this.name = name;
	}


	@Override
	public void printStruct(String str) {
		System.out.println(str+" - "+name);
		if(childComponents!=null){
			str = str+" ";
			for(Component c: childComponents){
				c.printStruct(str);
			}
		}
	}



	@Override
	public void addChild(Component child){
		if(childComponents == null){
			childComponents = new ArrayList<>();
		}
		childComponents.add(child);
	}


	
	@Override
	public void removeChild(Component child) {
		if(childComponents != null){
			childComponents.remove(child);
		}
	}

	

	@Override
	public Component getChild(int index) {
		if(childComponents != null){
			if(index >=0 && index <childComponents.size() ){
				return childComponents.get(index);
			}
		}
		return null;
	}



}
