package kosa.oop;

public class PhoneInfo {
	private String name;
	private String phoneNumber;
	private String birth;
	
	PhoneInfo(){
		
	}

	public PhoneInfo(String name, String phoneNumber, String birth) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birth = birth;
	}
	
	public void printPhoneInfo() {
		System.out.println(">�̸� : " + this.name);
		System.out.println(">��ȭ��ȣ : " + this.phoneNumber);
		System.out.println(">������� : " + this.birth);
	}

}
