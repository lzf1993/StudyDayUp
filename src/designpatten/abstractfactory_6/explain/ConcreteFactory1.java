package designpatten.abstractfactory_6.explain;


import designpatten.abstractfactory_6.explain.impl.ProductA1;
import designpatten.abstractfactory_6.explain.impl.ProductB1;

/**
 * 也可以认为是工厂方法，具体实现延迟到子类
 */
public class ConcreteFactory1 implements AbstractFactory{


	public AbstractProductA createProductA(){

		return new ProductA1();
	}


	public AbstractProductB createProductB(){

		return new ProductB1();
	}
}
