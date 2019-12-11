package designpatten.mediator_9.test1.impl;

import designpatten.mediator_9.Colleague;
import designpatten.mediator_9.Meadiator;


//cd驱动
public class CDDriver extends Colleague{

	private String data = "";

	public CDDriver(Meadiator meadiator) {
		super(meadiator);
	}

	public String getData(){
		return data;
	}


	public void readCD(){
		this.data = "设计模式,值得好好研究";
		//通知主面板，自己的状态改变了   --- 一个同事对象改变了，需要主动去通知中介者，让中介者去处理和其他同事的相关的交互
		this.getMediator().changed(this);
	}
}
