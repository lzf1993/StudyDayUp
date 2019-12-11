package designpatten.interpreter_20.test2;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;




//��ȡ Document����Ĺ��߶���
public class XmlUtil {


	public static Document getRoot(String filePathName) throws Exception{
	    System.out.println("filePathName == "+filePathName);
		Document doc = null;
		//����һ����������
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		//��ȡһ��DocumentBuilder���������������˾����Dom������
		DocumentBuilder builder = factory.newDocumentBuilder();

		//�õ�һ����ʾxml��Document����
		doc = builder.parse(filePathName);
		System.out.println("doc == "+doc);
		doc.normalize();
		return doc;
	}

}
