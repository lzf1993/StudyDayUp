package designpatten.visitor_24.test1;

import java.util.ArrayList;
import java.util.Collection;


//����ṹ��ͨ�����������Ԫ�ؽ��б������÷������ܷ��ʵ����е�Ԫ��
public class ObjectStructure {
	
	//���еĿͻ�����
	private Collection<Customer> col = new ArrayList<Customer>();
	
	
	/**
	 * �ṩ���ͻ��˲����ĸ߲�ӿڣ����幦���ɿͻ��˴���ķ����߾���
	 * �����ͻ�����ķ����߷����������൱�ڼ���һ������
	 * @param visitor
	 */
	public void handleRequest(Visitor visitor){
		//����Ԫ�أ�������accept����������ЩԪ�ؽ��շ���
		for(Customer cm:col){
			cm.accept(visitor);
		}
	}
	
	
	/**
	 * ��ӽڵ�Ԫ��
	 * @param ele
	 */
	public void addElement(Customer ele){
		this.col.add(ele);
	}
	
	
	

}
