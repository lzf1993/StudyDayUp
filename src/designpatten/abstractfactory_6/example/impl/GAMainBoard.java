package designpatten.abstractfactory_6.example.impl;


import designpatten.abstractfactory_6.example.MainboardApi;

//技嘉主板
public class GAMainBoard implements MainboardApi {

	//cpu 插槽个数
	private int cpuHols = 0;
	
	public GAMainBoard(int cpuHols){
		this.cpuHols = cpuHols;
	}
	
	@Override
	public void intsallCPU() {
        System.out.println("now is GAMaindboard , cpuHoles = "+cpuHols);		
	}

}
