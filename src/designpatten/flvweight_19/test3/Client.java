package designpatten.flvweight_19.test3;

public class Client {

	
	 public static void main(String args[]){
		 
		 //����Ȩ�޹�����
		 SecurityMgr mgr = SecurityMgr.getInstance();
		 
		 //���е�¼����
		 mgr.login("����");
		 mgr.login("����");
		 
		 boolean f1 = mgr.hasPermit("����", "н������", "�鿴");
		 System.out.println("�����Ƿ����鿴н������Ȩ�ޣ�"+f1);
		 boolean f2 = mgr.hasPermit("����", "н������", "�鿴");
		 System.out.println("�����Ƿ����鿴н������Ȩ�ޣ�"+f2);
		 boolean f3 = mgr.hasPermit("����", "н������", "�޸�");
		 System.out.println("�����Ƿ�����޸�н������Ȩ�ޣ�"+f3);
		 for(int i=0;i<3;i++){
			 mgr.login("����"+i);
			 mgr.hasPermit("����"+i, "н������", "�鿴");
		 }
	 }
}
