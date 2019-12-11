package designpatten.factorymethod_5;

public abstract class Creator {
  
	public abstract ExportFileApi factoryMethod();


	//直接调用方法，但不知道方法实现
	public void someOperation(){
		factoryMethod().export("");
	}
}
