package designpatten.abstractfactory_6.example.impl;


import designpatten.abstractfactory_6.example.MainboardApi;

public class MSIMainBoard implements MainboardApi {

	//cpu 插槽个数
	private int cpuHols = 0;
	
	public MSIMainBoard(int cpuHols){
		this.cpuHols = cpuHols;
	}
	
	@Override
	public void intsallCPU() {
		   System.out.println("now is MSIMainBoard , cpuHoles = "+cpuHols);				
	}

}
