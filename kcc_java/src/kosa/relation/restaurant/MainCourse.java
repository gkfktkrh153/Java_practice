package kosa.relation.restaurant;

public class MainCourse extends MenuItem{
	private boolean vegetarian;
	
	

	public MainCourse(String name, long price, String description, boolean vegetarian) {
		super(name, price, description);
		this.vegetarian = vegetarian;
	}
	

}
