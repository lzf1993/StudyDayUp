package designpatten.factory_1.impl;


import designpatten.factory_1.Api;

public class ImplA implements Api {

	@Override
	public void testA() {
		System.out.println("ImplA testA()....");
	}

	@Override
	public void testB() {
		System.out.println("ImplA testB()....");
	
	}

}
