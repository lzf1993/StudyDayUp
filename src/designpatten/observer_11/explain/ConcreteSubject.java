package designpatten.observer_11.explain;



//Ŀ����� - ����ʵ����
public class ConcreteSubject extends Subject{
    
	//Ŀ�����״̬
	private String subjectState;
	
	public String getSubjectState(){
		return subjectState;
	}
	
	
	//Ŀ�����״̬�ı�ʱ��֪ͨ�۲���
	public void setSubjectState(String subjectState){
		this.subjectState = subjectState;
		this.notifiObserver();
	}
}
