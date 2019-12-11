package designpatten.visitor_24.test2;


//����ṹ��ͨ���������Ԫ�ض�����б������÷������ܹ����ʵ����е�Ԫ��
public class ObjectStructure {

	//��Ԫ��
	private Component root = null;
	
	
	//������϶���ṹ�ĸ�Ԫ��
	public void setRoot(Component root){
		this.root = root;
	}
	
	
	public void handleRequest(Visitor visitor){
		//����϶���ṹ�еĸ�Ԫ�ؽ��շ���
		//����϶������Ѿ�ʵ����Ԫ�صı���
		if(root!=null){
			root.accept(visitor);
		}
	}
}
