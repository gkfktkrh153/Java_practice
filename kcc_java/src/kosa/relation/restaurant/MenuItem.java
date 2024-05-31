package kosa.relation.restaurant;

public class MenuItem {
	private String name;
	private long price;
	private String description;
	
	public MenuItem() {
		
	}

	public MenuItem(String name, long price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public long getPrice() {
		return price;
	}




	
}
