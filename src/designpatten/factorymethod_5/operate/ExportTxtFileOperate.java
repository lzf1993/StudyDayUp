package designpatten.factorymethod_5.operate;

import designpatten.factorymethod_5.ExportFileApi;
import designpatten.factorymethod_5.ExportOperate;
import designpatten.factorymethod_5.impl.ExportTxtFile;

public class ExportTxtFileOperate extends ExportOperate{

	@Override
	public ExportFileApi factoryMethod() {

		return new ExportTxtFile();
	}

}
