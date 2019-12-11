package designpatten.factory_1.impl;


import designpatten.factory_1.Api;

//实现类
public class ImplB implements Api {

	@Override
	public void testA() {
		System.out.println("ImplB testA()....");
	}

	@Override
	public void testB() {
		System.out.println("ImplB testB()....");
	}

}
