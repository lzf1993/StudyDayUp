package designpatten.singleton_4.impl;


//1、饿汉式：类加载的时候，对象就创建好了
public class HungrySingleton {

	private static HungrySingleton singleton2 = new HungrySingleton();

	private String name;

	private HungrySingleton(){

	}

	public static HungrySingleton getInstance(){
		return singleton2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
