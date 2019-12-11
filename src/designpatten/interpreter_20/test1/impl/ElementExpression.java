package designpatten.interpreter_20.test1.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.w3c.dom.Element;

import designpatten.interpreter_20.test1.Context;
import designpatten.interpreter_20.test1.ReadXmlExpression;

//Ԫ�� - ��Ϊ���ս����Ӧ�Ľ����� �����Ͳ�ִ���м�Ԫ��
//�൱����϶����еĽڵ�Ԫ�� ��������������ڵ�Ԫ�غ�Ҷ��Ԫ��
public class ElementExpression extends ReadXmlExpression{

	//��¼��ϵ�  ReadXmlExpression Ԫ��
	private Collection<ReadXmlExpression> eles = new ArrayList<>();
	
	//Ԫ�ص�����
	private String eleName = "";
	
	public ElementExpression(String eleName){
		this.eleName = eleName;
	}
	
	
	//�����Ԫ��
	public boolean addEle(ReadXmlExpression ele){
		this.eles.add(ele);
		return true;
	}
	
	
	//�Ƴ���Ԫ��
	public boolean removeEle(ReadXmlExpression ele){
		this.eles.remove(ele);
		return true;
	}
	
	
	@Override
	public String[] interpret(Context ctx) {
		 
		//ȡ���������е�ǰԪ����Ϊ����Ԫ��
		//���ҵ�ǰԪ�����ƶ�Ӧ��xmlԪ�أ������ûص���������
		Element pEle = ctx.getPreEle();
		System.out.println("pEle == "+pEle);
	
		if(pEle == null){
			//˵����ȡ���Ǹ�Ԫ��
			ctx.setPreEle(ctx.getDocument().getDocumentElement());
		}else{
			//���ݸ���Ԫ�غ�Ҫ���ҵ�Ԫ����������ȡ -- ��ǰԪ��
			Element nowEle = ctx.getNowEle(pEle, eleName);
			//�ѵ�ǰ��ȡ��Ԫ�طŵ���������
			ctx.setPreEle(nowEle);
		}
		
		//ѭ��������Ԫ�ص�interpret����
		String []ss = null;
		for(ReadXmlExpression ele:eles){
			ss = ele.interpret(ctx);
		}
		return ss;
	}

}
