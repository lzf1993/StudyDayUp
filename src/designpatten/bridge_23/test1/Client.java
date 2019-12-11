package designpatten.bridge_23.test1;


import designpatten.bridge_23.test1.sendimpl.MessageEmail;
import designpatten.bridge_23.test1.sendimpl.MessageMobile;
import designpatten.bridge_23.test1.sendimpl.MessageSMS;
import designpatten.bridge_23.test1.typeimpl.CommonMessage;
import designpatten.bridge_23.test1.typeimpl.SpecialUrgencyMessage;
import designpatten.bridge_23.test1.typeimpl.UrgencyMessage;

public class Client {


	public static void main(String agrs[]){

		//---------  ʹ��վ�ڶ���Ϣ��ʽ ----------- 
		MessageImplementor impl = new MessageSMS();

		//����һ����ͨ��Ϣ����
		AbstractMessage m = new CommonMessage(impl);
		m.sendMessage("���һ����", "С��");

		//����һ��������Ϣ����
		m = new UrgencyMessage(impl);
		m.sendMessage("���һ����", "С��");

		//����һ���ؼ���Ϣ����
		m = new SpecialUrgencyMessage(impl);
		m.sendMessage("���һ����", "С��");


		//---------  ʹ���ֻ�����Ϣ��ʽ ----------- 
		impl = new MessageMobile();

		//����һ����ͨ��Ϣ����
		m = new CommonMessage(impl);
		m.sendMessage("���һ����", "С��");

		//����һ��������Ϣ����
		m = new UrgencyMessage(impl);
		m.sendMessage("���һ����", "С��");

		//����һ���ؼ���Ϣ����
		m = new SpecialUrgencyMessage(impl);
		m.sendMessage("���һ����", "С��");


		//---------  ʹ��E-mail��ʽ ----------- 
		impl = new MessageEmail();

		//����һ����ͨ��Ϣ����
		m = new CommonMessage(impl);
		m.sendMessage("���һ����", "С��");

		//����һ��������Ϣ����
		m = new UrgencyMessage(impl);
		m.sendMessage("���һ����", "С��");

		//����һ���ؼ���Ϣ����
		m = new SpecialUrgencyMessage(impl);
		m.sendMessage("���һ����", "С��");
	}

}
