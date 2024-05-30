package kosa.oop.member;

public class Member {
	private String name;
	private int age;
	private static String address;
	
	Member(String name, int age, String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	void printInfo() {
		System.out.println("�̸� : " + this.name);
		System.out.println("���� : " + this.age);
		System.out.println("�ּ� : " + this.address);
	}
}
