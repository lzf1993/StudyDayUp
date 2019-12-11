package designpatten.interpreter_20.test3.impl.mult;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.w3c.dom.Element;

import designpatten.interpreter_20.test3.Context;
import designpatten.interpreter_20.test3.ReadXmlExpression;


//����Ԫ����Ϊ���ս���Ľ�����
public class ElementsExpession implements ReadXmlExpression{

	//��Ԫ�ؼ���
	private Collection<ReadXmlExpression> eles = new ArrayList<>();
	
	//Ԫ������
	private String eleName = "";
	
	
	public ElementsExpession(String eleName) {
		this.eleName = eleName;
	}
	
	
	//���Ԫ��
	public boolean addEle(ReadXmlExpression ele){
		this.eles.add(ele);
		return true;
	}
	
	
	//ɾ��Ԫ��
	public boolean removeEle(ReadXmlExpression ele){
		this.eles.remove(ele);
		return false;
	}
	
	
	@Override
	public String[] interpret(Context ctx) {
		
		//��ȡ���������еĸ���Ԫ��
		List<Element> pEles =  ctx.getPreEles();
		Element ele = null;
		
		//����ǰ��ȡ��Ԫ�ط��뵽��������
		List<Element> nowEles = new ArrayList<Element>();
		if(pEles.size() == 0){
			//˵�����ڻ�ȡ���Ǹ�Ԫ�� 
			ele = ctx.getDocument().getDocumentElement();
			pEles.add(ele);
			ctx.setPreEles(pEles);
		}else{
			//��ȡ���и����ֵ�Ԫ�ؼ���
			for(Element temp:pEles){
				nowEles.addAll(ctx.getNowEles(temp, eleName));
			}
			ctx.setPreEles(nowEles);
		}
		
		//ѭ�����ø�Ԫ�ؼ��ϵ�interpret�ķ���
		String []ss = null;
		for(ReadXmlExpression t:eles){
			ss = t.interpret(ctx);
		}
		return ss;
	}

}
