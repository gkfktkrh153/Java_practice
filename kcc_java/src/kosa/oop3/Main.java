package kosa.oop3;

public class Main {
	public static void main(String[] args) {
		Worker worker = new Worker();
		Student student = new Student();
		
		
		Person person1 = new Person("worker", worker);
		Person person2 = new Person("student", student);
		
		person1.doIt();
		person2.doIt();
	
	}
}
