package designpatten.observer_11.myself;

import designpatten.observer_11.explain.Subject;



//��ֽ --- Ŀ����
public class NewsPaper extends Subject{
 
	//��ֽ��������
	private String content;
		
	public String getContent(){
		return content;
	}
	
	
	//�������ˣ�˵������ֽ�ˣ���֪ͨ���еĶ���
	public void setContent(String content){
		this.content = content;
		notifiObserver();
	}
	
}
