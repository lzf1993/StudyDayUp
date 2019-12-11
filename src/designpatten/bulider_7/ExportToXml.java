package designpatten.bulider_7;

import java.util.Collection;
import java.util.Map;

import designpatten.bulider_7.dao.ExportDataModel;
import designpatten.bulider_7.dao.ExportFooterModel;
import designpatten.bulider_7.dao.ExportHeaderModel;



//流程是固定的
public class ExportToXml {


	//导出数据
	public void export(ExportHeaderModel ehm, Map<String ,Collection<ExportDataModel>> mapData,
					   ExportFooterModel efm){

		StringBuffer buffer = new StringBuffer();
		//拼接头部
		buffer.append("这是xml文件 ----------  \n");
		buffer.append(ehm.getDepId()+","+ehm.getExportDate()+"\n");
		//拼接数据
		for(String s: mapData.keySet()){
			buffer.append(s+"\n");
			for(ExportDataModel edm:mapData.get(s)){
				buffer.append("<r>"+edm.getProductId()+","+edm.getPrice()+","+edm.getAmount()+"</r>\n");
			}
		}
		//拼接底部
		buffer.append(efm.getExportUser());
		//输出
		System.out.println("输出到文本的内容：\n"+buffer);

	}
}