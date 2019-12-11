package designpatten.factorymethod_5.operate;

import designpatten.factorymethod_5.ExportFileApi;
import designpatten.factorymethod_5.ExportOperate;
import designpatten.factorymethod_5.impl.ExportDb;


//不是由子类实现功能，而是让子类选中具体的实现类
public class ExportDbOperate extends ExportOperate {

	@Override
	public ExportFileApi factoryMethod() {
		return new ExportDb();   //选中具体的实现类
	}

}
