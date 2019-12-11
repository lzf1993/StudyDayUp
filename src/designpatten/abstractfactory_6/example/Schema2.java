package designpatten.abstractfactory_6.example;


import designpatten.abstractfactory_6.example.MainboardApi;
import designpatten.abstractfactory_6.example.impl.AmdCPU;
import designpatten.abstractfactory_6.example.impl.MSIMainBoard;

// amd的cpu+ 微星的主板
public class Schema2 implements AbstractFactory{

	@Override
	public CPUApi createCPUApi() {
		return new AmdCPU(4678);
	}

	@Override
	public MainboardApi createMainBoardApi() {
		return new MSIMainBoard(4678);
	}

}
