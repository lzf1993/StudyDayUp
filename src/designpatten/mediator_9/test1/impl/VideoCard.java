package designpatten.mediator_9.test1.impl;

import designpatten.mediator_9.Colleague;
import designpatten.mediator_9.Meadiator;

//显卡
public class VideoCard extends Colleague{



	public VideoCard(Meadiator meadiator) {
		super(meadiator);
	}


	//显示数据
	public void showData(String data){
		System.out.println("您正在观看的是："+data);
	}

}
