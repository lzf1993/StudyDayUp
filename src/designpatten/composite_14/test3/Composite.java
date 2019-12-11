package designpatten.composite_14.test3;

import java.util.ArrayList;
import java.util.List;



//���ʵ����
public class Composite extends Component{

	//���������
	private List<Component> childCompoents = null;


	public Composite(String name) {
		super(name);
	}


	@Override
	public void addChild(Component child) {
		if(childCompoents == null){
			childCompoents = new ArrayList<>();
		}
		//���ø�����ǵ�ǰ����
		child.setParent(this); 
		//��ӽ�ȥ
		childCompoents.add(child);

		
		/****************����·��*********************/
		//·��Ϊ�գ���˵���ĸ����
		if(this.getPathName() == null || this.getPathName().trim().length() == 0){
			this.setPathName(this.getName());
		}

		//���·�����ֺ�Ҫ�����������ͬ����˵����ӹ�
		if(this.getPathName().startsWith(child.getName()+".")){
			throw new IllegalArgumentException("�ڱ�·���ϣ������"+child.getName()+"�Ѿ�����ӹ���..");
		}else{
			//��ʾû�м����
			if(this.getPathName().indexOf("."+child.getName())<0){
				//����·�� �� ��ǰ·�� + ���������
				String pathName = this.getPathName()+"."+child.getName();
				setPathName(pathName);
			}else{//�����
				throw new IllegalArgumentException("�ڱ�·���ϣ������"+child.getName()+"�Ѿ�����ӹ���..");
			}
		}
	}


	
	//��ӡ
	@Override
	public void printStruct(String str) {
		System.out.println(str+" - "+getName());
		if(childCompoents!=null && childCompoents.size()>0){
			str = str+" ";
			for(Component c: childCompoents){
				c.printStruct(str);
			}
		}
	}




	//ɾ��ĳһ����������Ȼ�ȡ����������е��������Ȼ���������Ϊ��ǰ���
	@Override
	public void removeChild(Component child) {
		if(childCompoents != null && childCompoents.size()>0){
			int idx = childCompoents.indexOf(child);
			if(idx!=-1){
				//�Ȱѱ�ɾ������Ʒ���ĸ���Ʒ������óɱ�ɾ����Ʒ�����ĸ���Ʒ���
				for(Component c:child.getChildren()){
					c.setParent(this);
					childCompoents.add(c);
				}
			}
			//�������Ƴ�
			childCompoents.remove(child);
		}
	}



	//��ȡĳ�������
	@Override
	public Component getChild(int index) {
		if(childCompoents != null && childCompoents.size()>0){
			if(index >=0 && index <childCompoents.size()){
				return childCompoents.get(index);
			}
		}
		return null;
	}


	
	//��ȡ���е������
	@Override
	public List<Component> getChildren() {
		if(childCompoents == null){
			childCompoents = new ArrayList<>();
		}
		return childCompoents;
	}



}
