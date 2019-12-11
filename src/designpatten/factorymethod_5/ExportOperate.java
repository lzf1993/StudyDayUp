package designpatten.factorymethod_5;


//实现导出数据的业务功能对象  --
public abstract class ExportOperate {

	public boolean export(String name){
		ExportFileApi api = factoryMethod();
		return api.export(name);
	}


	//工厂方法 -- 只知道接口，但不知道具体实现类
	public abstract ExportFileApi factoryMethod();
}
