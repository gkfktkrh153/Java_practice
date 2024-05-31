package kosa.relation.restaurant;

public class Dessert extends MenuItem{
	private boolean glutenFree;
	
	public Dessert() {}
	public Dessert(String name, long price, String description, boolean glutenFree) {
		super(name, price, description);
		this.glutenFree = glutenFree;
	}

}
