package designpatten.memento_18.test2;


//ʹ��ԭ��ģʽ 
public class FlowAMockPrototype implements Cloneable{

	//��Ŀ����
	private String flowName;

	//���
	private int tempResult;
    //״̬
	private String tempState;

	
	public FlowAMockPrototype(String flowName){
		this.flowName = flowName;
	}
	

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



	//��������¼��
	public FlowAMockMemento createMemento(){
		try {
			return new MementoImplPrototype((FlowAMockPrototype) this.clone());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public void setMemento(FlowAMockMemento memento){
		MementoImplPrototype implPrototype = (MementoImplPrototype) memento;
		tempResult = implPrototype.getMockPrototype().tempResult;
		tempState = implPrototype.getMockPrototype().tempState;	
	}


	
	//����¼��
	private static class MementoImplPrototype implements FlowAMockMemento{
		
		//ֱ�Ӵ洢ԭ�����Ķ���
		private FlowAMockPrototype flowAMock = null;

		public MementoImplPrototype(FlowAMockPrototype flowAMock){
			this.flowAMock = flowAMock;
		}
		
		public FlowAMockPrototype getMockPrototype(){
			return flowAMock;
		}
		
	}
}



