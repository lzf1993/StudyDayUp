package designpatten.flvweight_19.test1;

import java.util.ArrayList;
import java.util.Collection;



//ģ�����ݿ���Ȩ����Ϣ
public class TestDB {
  
	
	 public static Collection<String> colDB  = new ArrayList<>();
	 
	 static {
		 
		 colDB.add("����,��Ա�б�,�鿴");
		 colDB.add("����,��Ա�б�,�鿴");
		 colDB.add("����,н������,�鿴");
		 colDB.add("����,н������,�޸�");
		 //���Ӹ�����Ȩ
		 for(int i=0;i<3;i++){
			 colDB.add("����"+i+",��Ա�б�,�鿴");
		 }
	 }
	 
}
