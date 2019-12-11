package designpatten.singleton_4.impl;


//2、懒汉式 ： 需要的时候才创建
public class SlackerSingleton {

	private volatile static SlackerSingleton singleton =null;
	private String name;

	//构造方法私有
	private SlackerSingleton(){

	}


	//保证线程安全
	public static SlackerSingleton getInstance(){
		if(singleton == null){
			synchronized (SlackerSingleton.class) {
				if(singleton == null){
					singleton = new SlackerSingleton();
				}
			}
		}
		return singleton;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
