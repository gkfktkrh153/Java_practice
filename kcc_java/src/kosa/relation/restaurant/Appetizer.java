package kosa.relation.restaurant;

public class Appetizer extends MenuItem{
	private long calory;
	
	
	public Appetizer() {}
	public Appetizer(String name, long price, String description, long calory) {
		super(name, price, description);
		this.calory = calory;
	}

	private long calories;
}
