package kosa.relation.course;

public class Main {

	public static void main(String[] args) {
		Course c1 = new Course("�����а���");
		Course c2 = new Course("���������");
		Course c3 = new Course("�����Ͱ���");

		Student s1 = new Student("ȫ�浿");
		Student s2 = new Student("�ڱ浿");
		
		s1.register(c1);
		s1.register(c2);
		
		s2.register(c2);
		s2.register(c3);
		
		
	}

}
