package kosa.relation.course;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private List<Course> courses;
	
	
	public Student() {}
	
	public Student(String name) {
		this.name = name;
		this.courses = new ArrayList<>();
	}
	
	public void register(Course course) {
		courses.add(course);
		course.addStudent(this);
	}
	public void drop(Course course) {
		courses.remove(this);
		course.removeStudent(this);
	}
	public String getName() {
		return name;
	}


	
	
}
