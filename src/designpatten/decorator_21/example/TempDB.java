package designpatten.decorator_21.example;

import java.util.HashMap;
import java.util.Map;

public class TempDB {

	private TempDB(){
		
	}
	
	//��¼ÿ���˵��¶����۶ֻ������Ա���·�û����
	public static Map<String,Double> mapMonthSaleMoney = new HashMap<>();
	static{
		mapMonthSaleMoney.put("����", 10000.0);
		mapMonthSaleMoney.put("����", 10000.0);
		mapMonthSaleMoney.put("����", 10000.0);
		mapMonthSaleMoney.put("����", 10000.0);
	}
	
}
