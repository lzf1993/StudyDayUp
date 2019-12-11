package designpatten.singleton_4.impl;



//推荐单例模式
public class StaticSingleton {

	private String name = "Singleton3";

	public String getName(){
		return name;
	}

	public static StaticSingleton getInstance(){
		return Singleton.singleton3;
	}


	//类级的内部类，也就是静态的成员内部类，改内部类的实例和外部类的实例没有绑定关系，只有被调用的时候才会被装载
	//从而实现了延迟加载
	private static class Singleton{
		//静态初始化器，由JVM保证线程安全
		private static StaticSingleton singleton3= new StaticSingleton();
	}
}
