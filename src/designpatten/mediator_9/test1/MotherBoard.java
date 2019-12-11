package designpatten.mediator_9.test1;

import designpatten.mediator_9.Colleague;
import designpatten.mediator_9.Meadiator;
import designpatten.mediator_9.test1.impl.CDDriver;
import designpatten.mediator_9.test1.impl.CPU;
import designpatten.mediator_9.test1.impl.SoundCard;
import designpatten.mediator_9.test1.impl.VideoCard;

//主板类，实现中介者接口
public class MotherBoard implements Meadiator{

	//需要知道要交互的类

	//光驱类
	private CDDriver cdDriver = null;

	//cpu类
	private CPU cpu = null;

	//显卡类
	private VideoCard videoCard = null;

	//声卡类
	private SoundCard soundCard = null;


	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}


	public void setVideoCard(VideoCard videoCard) {
		this.videoCard = videoCard;
	}


	public void setSoundCard(SoundCard soundCard) {
		this.soundCard = soundCard;
	}


	public void setCdDriver(CDDriver cdDriver) {
		this.cdDriver = cdDriver;
	}



	@Override
	public void changed(Colleague colleague) {
		if(colleague == cdDriver){
			//表示光驱读取数据了
			openCDDriverReadData(cdDriver);
		}else if(colleague == cpu){
			//cpu处理完了
			openCpu(cpu);
		}
	}


	//cd读取数据交给cpu处理
	private void openCDDriverReadData(CDDriver cd){
		//1、读取光驱数据
		String data = cd.getData();
		//2、把这些数据传递给cpu进行处理
		this.cpu.executeData(data);
	}


	private void openCpu(CPU cpu){
		//3、先获取cpu处理后的数据
		String videoData = cpu.getVideoData();
		String soundData = cpu.getSoundData();

		//4、吧这些数据传递给显卡和声卡显示出来
		this.videoCard.showData(videoData);
		this.soundCard.soundData(soundData);
	}

}