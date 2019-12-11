package designpatten.abstractfactory_6.example.impl;


import designpatten.abstractfactory_6.example.CPUApi;

//intel的cpu实现
public class IntelCPU implements CPUApi {

	//cpu针脚的格式
	private int pins = 0;
	
	public IntelCPU(int pins){
		this.pins = pins;
	}

	
	@Override
	public void calcalate() {
         System.out.println("now is intel cpu , pins = "+pins);		
	}

}
