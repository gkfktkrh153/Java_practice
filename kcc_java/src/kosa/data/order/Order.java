package kosa.data.order;

import java.util.List;

public class Order {
	private List<Food> foods;
	
	public Order() {}

	public Order(List<Food> foods) {
		super();
		this.foods = foods;
	}

	public List<Food> getFoods() {
		return foods;
	}

	@Override
	public String toString() {
		String returnString = "주문 내용\n";
		for(Food food: foods) {
			returnString += food.getName() + " : " + food.getPrice() + "\n";
		}
		return returnString;
	}
	
	
}
