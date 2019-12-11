package designpatten.mediator_9.test1.impl;

import designpatten.mediator_9.Colleague;
import designpatten.mediator_9.Meadiator;

//声卡
public class SoundCard extends Colleague{

	public SoundCard(Meadiator meadiator) {
		super(meadiator);
	}


	//播放音频数据
	public void soundData(String data){
		System.out.println("画外音："+data);
	}
}
