package designpatten.memento_18.test3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//����¼������ -- ����洢����¼��
public class FlowAMementoFileCardTaker {


	//�洢����¼���� -- �洢���ļ���
	public void saveMemento(FlowAMock mock){
		ObjectOutputStream outputStream = null;
		try {
			outputStream = new ObjectOutputStream(new FileOutputStream("FlowAMcok"));
			outputStream.writeObject(mock);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//��ȡ����¼���� -- ���ļ��ж�ȡ
	public FlowAMock retiveMemento(){
		ObjectInputStream inputStream = null;
		FlowAMock mock = null;
		try {
			inputStream = new ObjectInputStream(new FileInputStream("FlowAMcok"));
			mock =(FlowAMock) inputStream.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return mock;
	}

}
