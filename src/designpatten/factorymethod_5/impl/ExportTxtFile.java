package designpatten.factorymethod_5.impl;

import designpatten.factorymethod_5.ExportFileApi;

public class ExportTxtFile implements ExportFileApi{

	@Override
	public boolean export(String data) {
		System.out.println("导成txt文件..."+data);
		return false;
	}

}
