package designpatten.composite_14.test3;

public class Leaf extends Component{

	//Ҷ�Ӷ��������
	private String name = "";
	
	public Leaf(String name){
		super(name);
		this.name = name;
	}
	
	
	@Override
	public void printStruct(String str) {
		System.out.println(str+" - "+name);
	}

}
