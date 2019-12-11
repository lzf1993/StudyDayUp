package designpatten.abstractfactory_6;


import designpatten.abstractfactory_6.example.AbstractFactory;
import designpatten.abstractfactory_6.example.CPUApi;
import designpatten.abstractfactory_6.example.CPUFactory;
import designpatten.abstractfactory_6.example.MainBoardFactory;
import designpatten.abstractfactory_6.example.MainboardApi;

//装机工程师
public class ComputerEnginner {

	//装机需要的cpu
	private CPUApi cpu = null;
	//装机需要的主板
	private MainboardApi mainboardApi = null;


	/**
	 * 使用普通方式，存在不匹配的情况
	 */
	public void makeComputer(int cputype , int mainBoardType){
		//准备好配件
		prepareHardwares(cputype,mainBoardType);
		//....
	}



	/**
	 * 使用抽象工厂，不会存在不匹配的情况
	 */
	public void makeComputer(AbstractFactory schema){
		//准备好配件
		prepareHardwares(schema);
		//....
	}



	//现在存在的问题，参数是可以任意传的，所以会存在不匹配的情况
	public void prepareHardwares(int cputype , int mainBoardType){
		this.cpu = CPUFactory.createApi(cputype);  //获取cpu
		this.mainboardApi = MainBoardFactory.createMainBoardApi(mainBoardType); //获取主板
		this.mainboardApi.intsallCPU(); //安装cpu
		this.cpu.calcalate(); //计算
	}


	//不会存在不匹配的问题
	public void prepareHardwares(AbstractFactory schema){
		this.cpu = schema.createCPUApi();  //获取cpu
		this.mainboardApi = schema.createMainBoardApi(); //获取主板
		this.mainboardApi.intsallCPU(); //安装cpu
		this.cpu.calcalate(); //计算
	}
}
