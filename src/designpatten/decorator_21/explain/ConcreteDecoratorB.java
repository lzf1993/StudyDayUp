package designpatten.decorator_21.explain;

//װ�����ľ���ʵ�ֶ���������������ְ��


public class ConcreteDecoratorB extends Decorator{

	
	public ConcreteDecoratorB(Component component) {
		super(component);
	}

	
	//��Ҫ��ӵ�ְ��
	private void addedBehavior(){
		//��Ҫ��ӵ�ְ��ʵ��
	}
	
	
	@Override
	public void operation() {
		//���ø���ķ������ڵ���ǰ�����ִ��һЩ���Ӷ���
		super.operation();
		addedBehavior();
	}
	
}
