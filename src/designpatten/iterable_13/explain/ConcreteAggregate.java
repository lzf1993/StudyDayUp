
package designpatten.iterable_13.explain;


//����ľۺ϶��� -- ʵ�ִ�����Ӧ�������Ĺ���
public class ConcreteAggregate extends Aggregate{

	private String[] ss = null;
	
	

	public ConcreteAggregate(String[] ss) {
		super();
		this.ss = ss;
	}



    //����������
	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}

	
	public Object get(int index){
		Object obj = null;
		if(index < ss.length){
			obj = ss[index];
		}
		return obj;
	}
	
	
	public int size(){
		return this.ss.length;
	}
	
	
}
