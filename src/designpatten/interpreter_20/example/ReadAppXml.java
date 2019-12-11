package designpatten.interpreter_20.example;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

//��ȡ�����ļ�
public class ReadAppXml{

	
	public void read(String fileName ) throws Exception{
		Document doc = null;
		
		//����һ����������
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		//���һ��DocumentBuilder����
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		//��ȡһ����ʾxml�ĵ���Doucment����
		doc = builder.parse(fileName);
		//ȥ���հ�����
		doc.normalize();
		
		//��ȡjdbc�ڵ�
		NodeList jdbc = doc.getElementsByTagName("jdbc");
		
		//��ȡjdbc�������Ԫ��
		NodeList drvierClassNode = ((Element)jdbc.item(0)).getElementsByTagName("driver-class");
		String driverClass = drvierClassNode.item(0).getFirstChild().getNodeValue();
		System.out.println("driverClass == "+driverClass);
		
		NodeList urlNode = ((Element)jdbc.item(0)).getElementsByTagName("url");
		String url = urlNode.item(0).getFirstChild().getNodeValue();
		System.out.println("url == "+url);
		
		
		NodeList userNode = ((Element)jdbc.item(0)).getElementsByTagName("user");
		String user = userNode.item(0).getFirstChild().getNodeValue();
		System.out.println("user == "+user);
		
		
		NodeList passwordNode = ((Element)jdbc.item(0)).getElementsByTagName("password");
		String password = passwordNode.item(0).getFirstChild().getNodeValue();
		System.out.println("password == "+password);
		
	}
	
}
