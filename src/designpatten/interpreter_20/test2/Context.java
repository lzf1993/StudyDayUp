package designpatten.interpreter_20.test2;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import designpatten.interpreter_20.test1.XmlUtil;

public class Context {

	//Dom ����xml��Document����
	private Document document = null;
	
	//��һ�α�����Ķ��Ԫ��
	private List<Element> preEles = new ArrayList<>();
	
	
	public Context(String fileName){
		URL url = this.getClass().getResource("");
		try {
			this.document = XmlUtil.getRoot(url.getPath()+fileName);
			System.out.println("document == "+document);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void reInit(){
		preEles = new ArrayList<>();
	}
	
	
	
	/**
	 * ���������������ķ���
	 * @param pEle    ��Ԫ��
	 * @param eleName ��ǰԪ�ص�����
	 * @return ��ǰ�Ķ��Ԫ�صļ���
	 */
	public List<Element> getNowEles(Element pEle, String eleName){
		List<Element> elements = new ArrayList<>();
		
		/*
		 * ��ȡԪ���б� �� ���縸Ԫ�ص� b,��ȡԪ��d,�򷵻ص��Ǹ�����
		 * <root id="rootOD">
                 <a>
                    <b>
                       <c name="testC">123456</c>
                       <d id="1">d1</d>
                       <d id="2">d1</d>
                       <d id="3">d1</d>
                       <d id="4">d1</d>
                   </b>
                 </a>
           </root>
		 */
		NodeList tempNodeList = pEle.getChildNodes();
		for(int i=0;i<tempNodeList.getLength();i++){
			if((tempNodeList.item(i) instanceof Element)){
				Element nowEle = (Element) tempNodeList.item(i);
				if(nowEle.getTagName().equals(eleName)){
					elements.add(nowEle);
				}
			}
		}
		return elements;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public List<Element> getPreEles() {
		return preEles;
	}

	public void setPreEles(List<Element> preEles) {
		this.preEles = preEles;
	}
	
	
	
	
	
}
