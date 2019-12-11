package designpatten.templatemethod_15.test2;

public class UserModel {

	private String useId;
	private String name;
	private int age;

	public UserModel(String useId, String name, int age) {
		super();
		this.useId = useId;
		this.name = name;
		this.age = age;
	}

	public String getUseId() {
		return useId;
	}

	public void setUseId(String useId) {
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

	@Override
	public String toString() {
		return "UserModel [useId=" + useId + ", name=" + name + ", age=" + age + "]";
	}
	
	



}
