package designpatten.abstractfactory_6.explain;

/**
 * createProductA 和 createProductB 可以认为是工厂方法
 */
public interface AbstractFactory {

	//创建cpu
	public AbstractProductA createProductA();

	//创建主板
	public AbstractProductB createProductB();
}
