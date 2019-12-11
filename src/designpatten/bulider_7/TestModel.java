package designpatten.bulider_7;

public class TestModel {

	private int money ;
	private String name;
	private long time;


	//构造器私有，防止外部进行实例化
	private TestModel(Builder builder) {
		super();
		//相当于指导者
		this.money = builder.getMoney();
		this.name = builder.getName();
		this.time = builder.getTime();
	}


	
	private static class Builder{

		private int money ;
		private String name;
		private long time;

		public int getMoney() {
			return money;
		}

		public Builder setMoney(int money) {
			this.money = money;
			return this;
		}

		public String getName() {
			return name;
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public long getTime() {
			return time;
		}

		public Builder setTime(long time) {
			this.time = time;
			return this;
		}

		/**
		 * 构建实例前，可以进行校验
		 * @return
		 */
		public TestModel builder(){
			if(money <0 ){
				throw new IllegalArgumentException("money 小于0...");
			}
			if(time <0 ){
				throw new IllegalArgumentException("time 小于0....");
			}
			if(name.isEmpty()){
				throw new IllegalArgumentException("name 为空....");
			}
			return new TestModel(this);
		}

	}

}
