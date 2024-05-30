package kosa.relation.course;

import java.util.ArrayList;
import java.util.List;

public class Course {
   private String name;   // �����
   private List<Student> students;
   
   public Course() {}
   public Course(String name) {
      this.name = name;
      students = new ArrayList<Student>();
   }
   
   public void addStudent(Student student) {
      students.add(student);
   }
   
   public void removeStudent(Student student) {
      if (students.contains(student)) {
         students.remove(student);
      }
   }
   
   public void printCourse() {
      System.out.println("�����: " + name);
      for (Student student: students) {
         System.out.println("������û �л���: " + student.getName());
      }
   }
   
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }   
}