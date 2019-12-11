package designpatten.interpreter_20.test1;

import java.net.URL;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Context {

	//��һ���������Ԫ��
	private Element preEle = null;
	
	
	//Dom����xml��Doucment����
	private Document document;
	
	
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
		preEle = null;
	}
	
	
	/**
	 * @param pEle     ��Ԫ��
	 * @param eleName  ��ǰԪ�ص�����
	 * @return  �ҵ���ǰ��Ԫ��
	 */
	public Element getNowEle(Element pEle, String eleName){
		
		NodeList tempNodeList = pEle.getChildNodes();
		for(int i=0;i<tempNodeList.getLength();i++){
			if(tempNodeList.item(i) instanceof Element){
				Element nowEle = (Element) tempNodeList.item(i);
				//�ҵ���ǰԪ����
				if(nowEle.getTagName().equals(eleName)){
					return nowEle;
				}
			}
		}
		return null;
	}


	public Element getPreEle() {
		return preEle;
	}


	public void setPreEle(Element preEle) {
		this.preEle = preEle;
	}


	public Document getDocument() {
		return document;
	}


	public void setDocument(Document document) {
		this.document = document;
	}
	
}
