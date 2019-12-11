package designpatten.factory_1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import designpatten.factory_1.impl.ImplA;
import designpatten.factory_1.impl.ImplB;


//简单工厂

//目的： 在于接口隔离，外部调用和内部实现进行隔离，这样就可以知道接口，但不用知道其实现
//作用： 选择合适的实现类,现类已经创建好,那么如何选择呢？有如下方式：
//       比如动态传参，文件中读取参数，或者读取内存、数据库参数


public class ApiFactory {


	//1、文件中读取参数，并通过反射创建实现类，这样增加新的类，不用每次添加新的判断
	public static Api createApi(){
		Properties properties = new Properties();
		InputStream inputStream = null;
		try {
			inputStream = ApiFactory.class.getResourceAsStream("factory.properties");
			properties.load(inputStream);
		} catch (IOException e) {
			System.out.println("装载出错... e: "+e);
			e.printStackTrace();
		}finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		Api api = null;
		try {
			api = (Api) Class.forName(properties.getProperty("ImplClass")).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return api;
	}




	//2、动态传参，每次有新的类，都要添加新的case
	public static Api createApi(int type){
		Api api = null;
		switch (type) {
		case 1:
			api = new ImplA();
			break;
		case 2:
			api = new ImplB();
			break;
		}
		return api;
	}
}
