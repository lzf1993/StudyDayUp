package designpatten.flvweight_19.test2;

import java.util.HashMap;
import java.util.Map;

//��Ԫ����
public class FlyweightFactory {

	private static FlyweightFactory factory = new FlyweightFactory();
	
	
	//use -> ��Ԫ���󣨰�ȫʵ�壬Ȩ�ޣ�
	private Map<String,Flyweight> fsmap = new HashMap<String,Flyweight>();
	
	
	private FlyweightFactory(){
		
	}
	
	
	public static FlyweightFactory getInstance(){
		return factory;
	}
	
	
	//����key��ȡ��Ԫ����
	public Flyweight getFlyweight(String key){
		Flyweight f = fsmap.get(key);
		if(f == null){
			f = new AuthorizationFlyweight(key);
			fsmap.put(key, f);
		}
		return f;
	}
	
	
	
	
	
}
