package designpatten.strategy_16.explain;


//�����ģ����в�����
public class Context {


	//����һ��������
	private Strategy strategy;

	
	public Context(Strategy strategy){
		this.strategy = strategy;
	}



	//���ò��������ķ���
	public void contextInterface(){
		if(strategy!=null){
			strategy.algorithmInterface();
		}
	}

}
