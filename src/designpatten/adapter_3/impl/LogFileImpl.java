package designpatten.adapter_3.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;


import designpatten.adapter_3.LogFileOperatorApi;
import designpatten.adapter_3.dao.LogcatModel;

public class LogFileImpl implements LogFileOperatorApi {

	private String fileName ="log.txt";

	@Override
	public void writeLogFile(List<LogcatModel> modles) {
        ObjectOutputStream stream = null;
        try {
			stream = new ObjectOutputStream(new FileOutputStream(new File(fileName)));
			stream.writeObject(modles);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<LogcatModel> readLogFile() {
		// TODO Auto-generated method stub
		ObjectInputStream stream = null;
		List<LogcatModel> list = null;
		try {
			stream = new ObjectInputStream(new FileInputStream(fileName));
			list = (List<LogcatModel>) stream.readObject();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return list;
	}

}
