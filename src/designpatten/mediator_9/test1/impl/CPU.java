package designpatten.mediator_9.test1.impl;

import designpatten.mediator_9.Colleague;
import designpatten.mediator_9.Meadiator;

//cpu
public class CPU extends Colleague{

	private String videoData = ""; //分解出来的视频数据
	private String soundData = ""; //分解出来的音频数据

	public CPU(Meadiator meadiator) {
		super(meadiator);
	}


	public String getVideoData() {
		return videoData;
	}

	public String getSoundData() {
		return soundData;
	}

	public void executeData(String data){
		String []ss = data.split(",");
		this.videoData = ss[0];
		this.soundData = ss[1];
		//通知主面板，cpu的工作完成   -- 一个同事对象改变了，需要主动去通知中介者，让中介者去处理和其他同事的相关的交互
		this.getMediator().changed(this);
	}


}
