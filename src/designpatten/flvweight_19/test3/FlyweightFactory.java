package designpatten.flvweight_19.test3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FlyweightFactory {

	private static FlyweightFactory factory = new FlyweightFactory();
	
	//������Flyweight����
	private Map<String,Flyweight> fsMap = new HashMap<String,Flyweight>();
	
	//�������汻�������Ļ������� keyֵһ��
	private Map<String,CacheConfModel> cacheConfMap = new HashMap<>();
	
	//��¼����������õļ��� ��keyֵһ��
	private Map<String,Integer> countMap = new HashMap<>();
	
	//Ĭ�ϱ���6�룬�����ã�ʵ�ʸ�����Ҫ��������
	private final long DURABLE_TIME = 6*1000;
	
	
	
	private FlyweightFactory(){
		//�����������ֵ���߳�
       new ClearCache().start();
	}
	
	
	public static FlyweightFactory getInstance(){
		return factory;
	}
	
	
	//��ȡĳ����Ԫ����ʹ�õĴ���
	public synchronized int getUserTimes(String key){
		Integer count = countMap.get(key);
		if(count == null){
			count = 0;
		}
		return count;
	}
	
	
	public synchronized Flyweight getFlyweight(String key){
		Flyweight f = fsMap.get(key);
		if(f == null){
			f = new AuthorizationFlyweight(key);
			fsMap.put(key, f);
			//ͬʱ�������ü���
			countMap.put(key, 1);
			
			//ͬʱ���û�����������
			CacheConfModel model = new CacheConfModel();
			model.setBeginTime(System.currentTimeMillis());
			model.setForever(false);
			model.setDurableTime(DURABLE_TIME);
			cacheConfMap.put(key, model);
		}else{
			
			//���»�����������
			CacheConfModel model = cacheConfMap.get(key);
			model.setBeginTime(System.currentTimeMillis());
			cacheConfMap.put(key, model);
			
			//������1
			Integer count = countMap.get(key);
			count++;
			countMap.put(key, count);
		}
		return f;
	}
	
	
	
	//ɾ������Ķ���
	private synchronized void removeFlyweight(String key){
		this.fsMap.remove(key);
		this.cacheConfMap.remove(key);
		this.countMap.remove(key);
	}
	
	
	
	//����������߳�
	private class ClearCache extends Thread{
		@Override
		public void run() {
			super.run();
			while(true){
				Set<String> temSet = new HashSet<String>();
				Set<String> set = cacheConfMap.keySet();
				for(String key:set){
					CacheConfModel cf = cacheConfMap.get(key);
					if((System.currentTimeMillis()- cf.getBeginTime())>cf.getDurableTime()){
						temSet.add(key);
					}
				}
				//��ʼ�������
				for(String key:temSet){
					FlyweightFactory.getInstance().removeFlyweight(key);
				}
				System.out.println("now thewad= "+fsMap.size()+",fsMap="+fsMap.keySet());
				try {
					Thread.sleep(1000L);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
	
	
	

	
}
