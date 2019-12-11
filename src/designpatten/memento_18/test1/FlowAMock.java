package designpatten.memento_18.test1;


//ģ������A -- ԭ����
public class FlowAMock {


	//�������� -- ����Ҫ�ⲿ�洢��״̬����
	private String flowName;

	//ָĳ���м�������Ҫ�ⲿ�洢��״̬����
	private int tempResult;

	//ĳ���м�������Ҫ�ⲿ�洢��״̬����
	private String tempState;



	public FlowAMock(String flowName){
		this.flowName = flowName;	
	}


	//�������̵ĵ�һ���׶�
	public void runPhaseOne(){
		tempResult = 3;
		tempState = "PhaseOne";
	}



	//�������̵ĵڶ����׶Σ����շ���һ���к󲿷�����
	public void schema1(){
		//ʾ�⣬��Ҫʹ�õ�һ�׶β���������
		this.tempState = tempState+",Schema1";
		System.out.println(this.tempState+": now run "+tempResult);
		this.tempResult = tempResult+11;
	}


	//�������̵ĵڶ����׶Σ����շ��������к󲿷�����
	public void schema2(){
		//ʾ�⣬��Ҫʹ�õ�һ�׶β���������
		this.tempState = tempState+",Schema2";
		System.out.println(this.tempState+": now run "+tempResult);
		this.tempResult = tempResult+22;
	}



	//��������¼����
	public FlowAMockMemento createMemento(){
		return new MementoImpl(tempResult, tempState);
	}
	
	
	
	//���跢���������״̬������ص�����¼�����¼��״̬
	public void setMemento(FlowAMockMemento memento){
		MementoImpl impl = (MementoImpl) memento;
		this.tempResult = impl.getTempResult();
		this.tempState = impl.getTempState();
	}



	//�����ı���¼����ʵ�ֱ���¼խ�ӿ�
	//���˽�е��ڲ��࣬�����ⲿ����
	private static class MementoImpl implements FlowAMockMemento{

		//ԭ����������
		private int tempResult ;
		private String tempState;

		public MementoImpl(int tempResult,String tempState){
			this.tempResult = tempResult;
			this.tempState = tempState;
		}

		public String getTempState(){
			return this.tempState;
		}

		public int getTempResult(){
			return this.tempResult;
		}

	}


}

