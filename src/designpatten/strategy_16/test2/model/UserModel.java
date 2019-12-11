package designpatten.strategy_16.test2.model;

public class UserModel {

	private static int NUM = 0;
	
	//�û�id
	private int useId;
	
	//����
	private String name;
	
	//����
	private int age;
	
	//�Ա�
	private int sex;

	public UserModel(String name, int age, int sex) {
		super();
		NUM ++;
		this.useId = 1990+NUM;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public int getUseId() {
		return useId;
	}

	public void setUseId(int useId) {
		this.useId = useId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}
	

	
}
