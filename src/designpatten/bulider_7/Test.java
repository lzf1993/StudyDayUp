package designpatten.bulider_7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import designpatten.bulider_7.dao.ExportDataModel;
import designpatten.bulider_7.dao.ExportFooterModel;
import designpatten.bulider_7.dao.ExportHeaderModel;
import designpatten.bulider_7.impl.TxtBuilder;

class Test {



    //7、生成器模式
    private void builder(){

        //头部数据
        ExportHeaderModel model = new ExportHeaderModel();
        model.setDepId("一分公司");
        model.setExportDate("2018-1-8");


        //数据体
        Map<String,Collection<ExportDataModel>> mapData=
                new HashMap<String,Collection<ExportDataModel>>();

        Collection<ExportDataModel> collection= new ArrayList<>();

        ExportDataModel dataModel1 = new ExportDataModel();
        dataModel1.setAmount(100);
        dataModel1.setPrice(102);
        dataModel1.setProductId("001号产品");

        ExportDataModel dataModel2 = new ExportDataModel();
        dataModel2.setAmount(10);
        dataModel2.setPrice(120);
        dataModel2.setProductId("002号产品");

        collection.add(dataModel1);
        collection.add(dataModel2);

        mapData.put("销售记录表", collection);

        //底部数据
        ExportFooterModel footerModel = new ExportFooterModel();
        footerModel.setExportUser("张三");

        //输出数据
        //ExportToXml exportToTxt = new ExportToXml();
        //exportToTxt.export(model, mapData, footerModel);
        TxtBuilder builder = new TxtBuilder();
        Director director = new Director(builder);
        director.construct(model, mapData, footerModel);

    }

}
