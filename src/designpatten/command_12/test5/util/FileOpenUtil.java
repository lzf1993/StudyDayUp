package designpatten.command_12.test5.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import designpatten.command_12.test5.Command;

public class FileOpenUtil {

	private FileOpenUtil(){
		
	}


	//��ȡ����
	public static List<Command> readFile(String name){
		List<Command> list = null;
		ObjectInputStream ins = null;
		try {
			ins = new ObjectInputStream(new FileInputStream(name));
			list = (List<Command>) ins.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				ins.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return list;
	}




	//��������
	public static void writeFile(List<Command> list,String name){
		ObjectOutputStream ous = null;
		try {
			ous = new ObjectOutputStream(new FileOutputStream(name));
			ous.writeObject(list);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				ous.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void writeFile(List<Command> list1,List<Command> list2,String name){
		List<Command> list = new ArrayList<>();
		list.addAll(list1);
		list.addAll(list2);
		ObjectOutputStream ous = null;
		try {
			ous = new ObjectOutputStream(new FileOutputStream(name));
			ous.writeObject(list);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				ous.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


}
