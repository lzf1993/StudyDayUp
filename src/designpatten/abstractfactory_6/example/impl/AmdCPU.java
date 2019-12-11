package designpatten.abstractfactory_6.example.impl;


import designpatten.abstractfactory_6.example.CPUApi;

public class AmdCPU implements CPUApi {

	private int pins = 0;
	
	public AmdCPU(int pins){
		this.pins = pins;
	}
	
	@Override
	public void calcalate() {
        System.out.println("now is AMD CPU ��pins = "+pins);		
	}

}
