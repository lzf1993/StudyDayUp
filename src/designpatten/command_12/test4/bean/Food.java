package designpatten.command_12.test4.bean;


//��
public class Food {

	//�˵�����
	private String name;
	//�۸�
	private int price;	
	//����
	private FoodType type;
	
	
	public Food(String name,int price,FoodType type){
		this.name = name;
		this.price = price;
		this.type = type;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public FoodType getType() {
		return type;
	}
	
	public void setType(FoodType type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + ", type=" + type + "]";
	}


    

}
