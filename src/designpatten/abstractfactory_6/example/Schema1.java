package designpatten.abstractfactory_6.example;


import designpatten.abstractfactory_6.example.impl.GAMainBoard;
import designpatten.abstractfactory_6.example.impl.IntelCPU;

//intel cpu + 技嘉主板
public class Schema1 implements AbstractFactory{

	@Override
	public CPUApi createCPUApi() {
		return new IntelCPU(1654);
	}

	@Override
	public MainboardApi createMainBoardApi() {
		return new GAMainBoard(1654);
	}

}
