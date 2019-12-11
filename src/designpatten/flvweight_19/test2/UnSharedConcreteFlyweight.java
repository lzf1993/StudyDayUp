package designpatten.flvweight_19.test2;

import java.util.ArrayList;
import java.util.List;

public class UnSharedConcreteFlyweight implements Flyweight{

	//��¼��϶���������
	private List<Flyweight> list = new ArrayList<>();

	
	//��Ҫ��֤ʱ�򣬵ݹ����
	@Override
	public boolean match(String securityEntity, String permit) {
		for(Flyweight f:list){
			if(f.match(securityEntity, permit)){
				return true;
			}
		}
		return false;
	}

	
	//�����Ԫ�����
	@Override
	public void add(Flyweight f) {
		list.add(f);		
	}

}
