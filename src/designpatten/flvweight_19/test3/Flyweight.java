package designpatten.flvweight_19.test3;

public interface Flyweight {

	//����Ȩ����֤
	public boolean match(String securityEntity, String permit);
	
	
	//����Ӷ���
	public void add(Flyweight f);
	
}
