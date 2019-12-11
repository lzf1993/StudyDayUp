package designpatten.flvweight_19.explain;

import java.util.HashMap;
import java.util.Map;

//��Ԫ����
public class FlyweightFactory {
	
	
	//������Flyweight����
    private Map<String,Flyweight> fsMap = new HashMap<String,Flyweight>();
    
    
    //ͨ��key��ȡ��Ԫ����
    public Flyweight getFlyweight(String key){
    	//�ȴӻ����в���
    	Flyweight f = fsMap.get(key);
    	if(f==null){
    		f = new ConcreteFlyweight(key);
    		fsMap.put(key, f);
    	}
    	return f;
    }
    
    
    
}
