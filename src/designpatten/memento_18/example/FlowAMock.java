package designpatten.memento_18.example;


//ģ����������A 
public class FlowAMock {

	//��������
	private String name;

	//ʾ������ָı���м�������Ҫ�ⲿ�洢��״̬����
	private int temResult;

	//ʾ�⣺��ָ�м��ĳ���������Ҫ�ⲿ�洢����
	private String tempState;


	public FlowAMock(String name){
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getTemResult() {
		return temResult;
	}


	public void setTemResult(int temResult) {
		this.temResult = temResult;
	}


	public String getTempState() {
		return tempState;
	}


	public void setTempState(String tempState) {
		this.tempState = tempState;
	}


	//ʾ�⣬�������̵ĵ�һ�׶�
	public void runPhaseOne(){
		temResult = 3;
		tempState ="PhaseOne";
	}


	//ʾ�⣺���շ���һ���к󲿷�����
	public void schema1(){
		//ʾ�⣬��Ҫʹ�õ�һ�׶β���������
		this.tempState = tempState+",Schema1";
		System.out.println(this.tempState+": now run "+temResult);
		this.temResult = temResult+11;
	}


	//ʾ�⣺���շ��������к󲿷�����
	public void schema2(){
		//ʾ�⣬��Ҫʹ�õ�һ�׶β���������
		this.tempState = tempState+",Schema2";
		System.out.println(this.tempState+": now run "+temResult);
		this.temResult = temResult+22;
	}

}


