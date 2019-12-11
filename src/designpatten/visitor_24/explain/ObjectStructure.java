package designpatten.visitor_24.explain;

import java.util.ArrayList;
import java.util.Collection;

public class ObjectStructure {
	
	//����ṹ��������һ�����Ԫ�ػ��߼���
	private Collection<Element> col = new ArrayList<Element>();
	
	//ʾ�ⷽ�����ṩ���ͻ��˲����ĸ߲�ӿ�
	public void handleRequest(Visitor visitor){
		//ѭ������ṹ�е�Ԫ�أ����շ���
		for(Element ele:col){
			ele.accept(visitor);
		}
	}
	
	
	/**
	 * ��ͬ��
	 * @param ele
	 */
	public void addElement(Element ele){
		this.col.add(ele);
	}

}
