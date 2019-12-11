package designpatten.abstractfactory_6.example;

public interface AbstractFactory {
	
	//创建cpu
   public CPUApi createCPUApi();
   
   
   //创建主板
   public MainboardApi createMainBoardApi();
}
