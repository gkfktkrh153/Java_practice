package kosa.data.person;

public class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	public Person() {};
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	public int compareTo(Person o) {
		if(this.age > o.getAge())
			return 1;

		
		return -1; // 0
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름 : " + this.name + " 나이 : " + this.age;
	}
	

}
