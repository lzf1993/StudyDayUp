package designpatten.flvweight_19.test2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;



//ģ�����ݿ���Ȩ����Ϣ
public class TestDB {
  
	
	 public static Collection<String> colDB  = new ArrayList<>();
	 
	 //�������
	 public static Map<String,String[]> mapDB  = new HashMap<>();
	 
	 static {
		 //���ݿ��ŵ�����
		 colDB.add("����,��Ա�б�,�鿴,1");
		 colDB.add("����,��Ա�б�,�鿴,1");
		 colDB.add("����,н������,�鿴,1");
		 
		 //��϶���
		 colDB.add("����,����н������,,2");
		 
		 //����������
		 mapDB.put("����н������",new String[]{"н������,�鿴","н������","�޸�"});
		 //���Ӹ�����Ȩ
		 for(int i=0;i<3;i++){
			 colDB.add("����"+i+",��Ա�б�,�鿴");
		 }
	 }
	 
}
