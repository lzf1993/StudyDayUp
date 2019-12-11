package designpatten.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import designpatten.abstractfactory_6.ComputerEnginner;
import designpatten.abstractfactory_6.example.Schema1;
import designpatten.adapter_3.LogFileToDbAdapter;
import designpatten.adapter_3.dao.LogcatModel;
import designpatten.adapter_3.impl.LogDbImpl;
import designpatten.adapter_3.impl.LogFileImpl;
import designpatten.appearance_2.FacadeApi;
import designpatten.appearance_2.impl.ImplA1;
import designpatten.appearance_2.impl.ImplB1;
import designpatten.appearance_2.impl.ImplC1;
import designpatten.bulider_7.Director;
import designpatten.bulider_7.dao.ExportDataModel;
import designpatten.bulider_7.dao.ExportFooterModel;
import designpatten.bulider_7.dao.ExportHeaderModel;
import designpatten.bulider_7.impl.TxtBuilder;
import designpatten.factory_1.ApiFactory;
import designpatten.factorymethod_5.ExportOperate;
import designpatten.factorymethod_5.operate.ExportTxtFileOperate;
import designpatten.mediator_9.test1.MotherBoard;
import designpatten.mediator_9.test1.impl.CDDriver;
import designpatten.mediator_9.test1.impl.CPU;
import designpatten.mediator_9.test1.impl.SoundCard;
import designpatten.mediator_9.test1.impl.VideoCard;
import designpatten.mediator_9.test2.DepUserMediatorImpl;
import designpatten.mediator_9.test2.dao.Dep;
import designpatten.mediator_9.test2.dao.User;
import designpatten.observer_11.javautil.NewsPaper2;
import designpatten.observer_11.javautil.Reader2;
import designpatten.observer_11.myself.NewsPaper;
import designpatten.observer_11.myself.Reader;
import designpatten.prototype_8.OrderBusiness;
import designpatten.prototype_8.self.EnterpriseOrder;
import designpatten.singleton_4.impl.StaticSingleton;

public class Test {

	public static void main(String args[]){
		Design design = new Design();

		design.factory();
		design.apperance();
		design.adapter();
		design.factoryMethod();
		design.single();
		design.abstractFactory();
		design.builder();
		design.prototype();
		design.mediator1();
		design.mediator2();
		design.observer();
	}


	static class Design{


		//1������ģʽ
		private void factory(){
			ApiFactory.createApi().testA();
			System.out.println(" ------------------ ");
		}


		//2�����ģʽ
		private void apperance(){
			//���û�����ģʽ����ϵͳ�ⲿҪ֪��ϵͳ�ڲ��Ĺ�ϵ : ���� ϵͳ1- ϵͳ3 -ϵͳ2
			new ImplA1().test1();
			new ImplC1().test3();
			new ImplB1().test2();
			System.out.println(" ------------------ ");
			//����
			new FacadeApi().test();
		}


		//3��������ģʽ
		private void adapter(){
			List<LogcatModel> modles = new ArrayList<>();
			modles.add(new LogcatModel("log1"));
			modles.add(new LogcatModel("log2"));

			new LogFileImpl().writeLogFile(modles);
			System.out.println("��ȡ�����ݣ� "+new LogFileImpl().readLogFile());


			//ʹ�����ݿ�
			new LogDbImpl().updateLog(1);
			new LogFileToDbAdapter(new LogFileImpl()).updateLog(1);
			System.out.println(" ------------------ ");
		}



		//4����������
		private void factoryMethod(){
			ExportOperate operate = new ExportTxtFileOperate();
			operate.export("��������");
			System.out.println(" ------------------ ");
		}



		//5������ģʽ
		private void single(){
			System.out.println("name: "+ StaticSingleton.getInstance().getName());
			System.out.println(" ------------------ ");
		}



		//6�����󹤳�ģʽ
		private void abstractFactory(){
			ComputerEnginner enginner = new ComputerEnginner();
			//enginner.makeComputer(1, 1);
			enginner.makeComputer(new Schema1());
			System.out.println(" ------------------ ");
		}



		//7��������ģʽ
		private void builder(){

			//ͷ������
			ExportHeaderModel model = new ExportHeaderModel();
			model.setDepId("һ�ֹ�˾");
			model.setExportDate("2018-1-8");


			//������
			Map<String,Collection<ExportDataModel>> mapData= 
					new HashMap<String,Collection<ExportDataModel>>();

			Collection<ExportDataModel> collection= new ArrayList<>();

			ExportDataModel dataModel1 = new ExportDataModel();
			dataModel1.setAmount(100);
			dataModel1.setPrice(102);
			dataModel1.setProductId("001�Ų�Ʒ");

			ExportDataModel dataModel2 = new ExportDataModel();
			dataModel2.setAmount(10);
			dataModel2.setPrice(120);
			dataModel2.setProductId("002�Ų�Ʒ");

			collection.add(dataModel1);
			collection.add(dataModel2);

			mapData.put("���ۼ�¼��", collection);

			//�ײ�����
			ExportFooterModel footerModel = new ExportFooterModel();
			footerModel.setExportUser("����");

			//�������
			//ExportToXml exportToTxt = new ExportToXml();
			//exportToTxt.export(model, mapData, footerModel);
			TxtBuilder builder = new TxtBuilder();
			Director director = new Director(builder);
			director.construct(model, mapData, footerModel);

		}

		
		
		//8��ԭ��ģʽ
		private void prototype(){
			OrderBusiness order =new OrderBusiness();
			EnterpriseOrder enterpriseOrder = new EnterpriseOrder();
			enterpriseOrder.setEnterpriseName("��ҵ����");
			enterpriseOrder.setOrderProductNum(3900);
			enterpriseOrder.setProductId("10003");
			order.saveOrder(enterpriseOrder);
		}
		
		
		//�н���ģʽ
		private void mediator1(){
			MotherBoard motherBoard = new MotherBoard();
			
			//cd
			CDDriver cdDriver = new CDDriver(motherBoard);
			//Cpu
			CPU cpu = new CPU(motherBoard);
			//voice
			VideoCard videoCard = new VideoCard(motherBoard);
			SoundCard soundCard = new SoundCard(motherBoard);
			
			
			motherBoard.setCdDriver(cdDriver);
			motherBoard.setCpu(cpu);
			motherBoard.setSoundCard(soundCard);
			motherBoard.setVideoCard(videoCard);
			
			cdDriver.readCD();	
		}
		
		
		private void mediator2(){
			DepUserMediatorImpl impl = DepUserMediatorImpl.getInstance();
			
			Dep dep = new Dep();
			dep.setDepId("d1");
			Dep dep2 = new Dep();
			dep2.setDepId("d2");
			
			User user = new User();
			user.setUserId("u1");
		
			System.out.println("��������ǰ -------------- ");
			impl.deleteDep(dep.getDepId());
			
			System.out.println("�������ź� --------------- ");
			impl.showUserDeps(user);
		}
		
		
		//�۲���ģʽ
		private void observer(){
			System.out.println(" \n ---------- �Լ�ʵ�ֹ۲���ģʽ ---------------\n ");
			NewsPaper newsPaper =new NewsPaper();
			String names [] ={"����","����","����","����","����","Ǯ��","�ܾ�","��ʮ"};
			for(int i=0;i<names.length;i++){
				Reader reader = new Reader();
				reader.setName(names[i]);
				//����ע��
				newsPaper.attach(reader);
			}
			
			try {
				System.out.println("�ȴ��������ֽ.......");
				Thread.sleep(1000*3);
				System.out.println("��ֽ����.......");
				newsPaper.setContent("���������ǹ۲���ģʽ");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(" \n ---------- javaʵ�ֹ۲���ģʽ ---------------\n ");
			
			
			NewsPaper2 newsPaper2 =new NewsPaper2();
			for(int i=0;i<names.length;i++){
				Reader2 reader2 = new Reader2();
				reader2.setName(names[i]);
				//����ע��
				newsPaper2.addObserver(reader2);
			}
			
			try {
				System.out.println("�ȴ��������ֽ.......");
				Thread.sleep(1000*3);
				System.out.println("��ֽ����.......");
				newsPaper2.setContent("���������ǹ۲���ģʽ");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
