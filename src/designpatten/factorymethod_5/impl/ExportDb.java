package designpatten.factorymethod_5.impl;

import designpatten.factorymethod_5.ExportFileApi;

public class ExportDb implements ExportFileApi{

	@Override
	public boolean export(String data) {
		System.out.println("导成数据库...");
		return false;
	}

}
