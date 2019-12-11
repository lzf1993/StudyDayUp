package designpatten.bulider_7;

import java.util.Collection;
import java.util.Map;

import designpatten.bulider_7.dao.ExportDataModel;
import designpatten.bulider_7.dao.ExportFooterModel;
import designpatten.bulider_7.dao.ExportHeaderModel;



//生成器,具体的构建部件
public interface Builder {

	//构建头部
	public void builderHeader(ExportHeaderModel m);

	//构建数据体
	public void builderBody(Map<String,Collection<ExportDataModel>> mapData);

	//构建文件尾部
	public void builderFooter(ExportFooterModel efm);

	//获取数据
	public String getResult();
}
