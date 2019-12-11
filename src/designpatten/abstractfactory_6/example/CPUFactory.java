package designpatten.abstractfactory_6.example;


import designpatten.abstractfactory_6.example.impl.AmdCPU;
import designpatten.abstractfactory_6.example.impl.IntelCPU;

//CPU的工厂
public class CPUFactory {

	public static CPUApi createApi(int type){
		CPUApi cpu = null;	
		switch(type){
		case 1:
			cpu = new IntelCPU(1156);
			break;
		case 2:
			cpu = new AmdCPU(1156);
			break;
		}
		return cpu;
	}
	
	
}
