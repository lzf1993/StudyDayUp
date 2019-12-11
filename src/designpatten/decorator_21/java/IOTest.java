package designpatten.decorator_21.java;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class IOTest {

	//InputStream �൱��װ��ģʽ�е�Component
	
	//FileInputStream��ObjectInputStream��StringBufferInputStream�൱�� ConcreteComponent���ǿ��Ա�װ�ε���
	
	//FilterInputStream�൱�� Decorator��װ�θ��ࣩ
	
	//��FilterInputStream�����ࣺDataInputStream��BufferInputStream��LineNumberInputStream�൱��װ��ģʽ��
	//ConcreteDecorator
	public static void main(String args[]){		
		DataInputStream din = null;
		try {
			din = new DataInputStream(new BufferedInputStream(new FileInputStream("IOTest.txt")));
		    byte bs[] = new byte[din.available()];
		    din.read(bs);
		    String content = new String(bs);
		    System.out.println("�ļ�����===="+content);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				din.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
