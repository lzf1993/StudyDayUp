package designpatten.observer_11.javautil;

import java.util.Observable;


//��ֽ����   -- Ŀ���ߣ����۲��ߣ�
public class NewsPaper2 extends Observable{
   
	private String content;
	
	public String getContent(){
		return content;
	}
	
	
	//�������ݣ�˵�����±�ֽ�ˣ���֪ͨ���еĶ���
	public void setContent(String content){
		this.content = content;
		//��ʼ֪ͨ�۲���
		this.setChanged();
		this.notifyObservers();  //���ķ�ʽ������Ŀ�����
		//this.notifyObservers(content); //�Ƶķ�ʽ��ֱ�Ӵ�������
	}
	
	
}
