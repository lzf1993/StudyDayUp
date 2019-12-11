package designpatten.bulider_7;

import java.util.Collection;
import java.util.Map;

import designpatten.bulider_7.dao.ExportDataModel;
import designpatten.bulider_7.dao.ExportFooterModel;
import designpatten.bulider_7.dao.ExportHeaderModel;




//指导者： 不变的东西抽取出来，抽成一个流程，知道构建的流程
public class Director {


	//1、builder接口
	private Builder builder;

	public Director(Builder builder){
		this.builder = builder;
	}




	//构建过程独立出来
	public void construct(ExportHeaderModel ehm, Map<String ,Collection<ExportDataModel>> mapData,
						  ExportFooterModel efm){

		//2 、能够细化分步骤构建产品
		builder.builderHeader(ehm);
		builder.builderBody(mapData);
		builder.builderFooter(efm);
		System.out.println(builder.getResult());
	}
}