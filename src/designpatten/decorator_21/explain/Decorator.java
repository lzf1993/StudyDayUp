package designpatten.decorator_21.explain;


//����װ�����ĳ����࣬��Ҫ����һ��������ӿ�һ�µĽӿڣ�������һ��Component����
public class Decorator extends Component{

	
	//�����������
	private Component component;
	
	
	public Decorator(Component component){
		this.component = component;
	}
	
	
	//ת�������������󣬿�����ת��ǰ����һЩ���Ӷ���
	@Override
	public void operation() {
		component.operation();
	}

}
