package kosa.oop.phone;

import java.io.Serializable;

public class PhoneInfo implements Serializable{
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
	
	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}


	public String getBirth() {
		return birth;
	}
	public void printPhoneInfo() {
		System.out.println(">이름 : " + this.name);
		System.out.println(">전화번호 : " + this.phoneNumber);
		System.out.println(">생년월일 : " + this.birth);
	}

	public void updatePhoneNumber(String updatePhoneNumber) {
		this.phoneNumber = updatePhoneNumber;
	}
}
