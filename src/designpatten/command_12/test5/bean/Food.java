package designpatten.command_12.test5.bean;

import java.io.Serializable;

/**
 * @author lzf
 *
 * ʳ��
 */
public class Food implements Serializable{

	//����
	private String name;
	
	//�۸�
	private int price;
		
	//ʳƷ����
	private FoodType type;
	
	
	
	

	public Food(String name, int price, FoodType type) {
		super();
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
	
}
