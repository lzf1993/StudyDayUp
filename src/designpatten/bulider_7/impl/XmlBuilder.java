package designpatten.bulider_7.impl;

import java.util.Collection;
import java.util.Map;

import designpatten.bulider_7.Builder;
import designpatten.bulider_7.dao.ExportDataModel;
import designpatten.bulider_7.dao.ExportFooterModel;
import designpatten.bulider_7.dao.ExportHeaderModel;

public class XmlBuilder implements Builder{

	StringBuffer buffer = new StringBuffer();

	@Override
	public void builderHeader(ExportHeaderModel ehm) {
		//拼接头部
		buffer.append("这是xml文件 ----------  \n");
		buffer.append(ehm.getDepId()+","+ehm.getExportDate()+"\n");
	}

	@Override
	public void builderBody(Map<String, Collection<ExportDataModel>> mapData) {
		//拼接数据
		for(String s: mapData.keySet()){
			buffer.append(s+"\n");
			for(ExportDataModel edm:mapData.get(s)){
				buffer.append("<r>"+edm.getProductId()+","+edm.getPrice()+","+edm.getAmount()+"</r>\n");
			}
		}
	}

	@Override
	public void builderFooter(ExportFooterModel efm) {
		//拼接底部
		buffer.append(efm.getExportUser());
	}


	/**
	 * 获取结果
	 * @return
	 */
	public String getResult(){
		return buffer.toString();
	}

}
