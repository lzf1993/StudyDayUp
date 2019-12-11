package designpatten.composite_14.test3;

import java.util.List;



//����������
public abstract class Component {

	//�������
	private String name;
	//�����
	private Component parent = null;
	//·������
	private String pathName;

	
	public Component(String name){
		this.name = name;
	}
	
   
	//��ӡ����
	public abstract void printStruct(String preStr);
	
	
	//��������
	public void addChild(Component child){
		throw new UnsupportedOperationException("����֧�ָù���");
	}
	
	//�Ƴ������
	public void removeChild(Component child){
		throw new UnsupportedOperationException("����֧�ָù���");
	}
	
	//��ȡ�����
	public Component getChild(int index){
		throw new UnsupportedOperationException("����֧�ָù���");
	}
	
	//��ȡ���е������
	public List<Component> getChildren(){
		throw new UnsupportedOperationException("����֧�ָù���");
	} 
	
	
	
	/**********set��get����**********/
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPathName() {
		return pathName;
	}

	public void setPathName(String pathName) {
		this.pathName = pathName;
	}
	
	public Component getParent() {
		return parent;
	}

	public void setParent(Component parent) {
		this.parent = parent;
	}
	
}

