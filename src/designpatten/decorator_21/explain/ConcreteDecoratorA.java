package designpatten.decorator_21.explain;

//װ�����ľ���ʵ�ֶ���������������ְ��


public class ConcreteDecoratorA extends Decorator{

	//���״̬
	private String addedState;
	
	
	public ConcreteDecoratorA(Component component) {
		super(component);
	}

	
	public String getAddedState() {
		return addedState;
	}
	

	public void setAddedState(String addedState) {
		this.addedState = addedState;
	}
	
	
	@Override
	public void operation() {
		super.operation();
	}
	
}
