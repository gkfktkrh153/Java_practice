package kosa.oop.phone;

public class UniversePhoneInfo extends PhoneInfo {
	private String major;
	private String year;

	UniversePhoneInfo() {

	}

	public UniversePhoneInfo(String name, String phoneNumber, String birth, String major, String year) {
		super(name, phoneNumber, birth);
		this.major = major;
		this.year = year;

	}

	public void printPhoneInfo() {
		super.printPhoneInfo();
		System.out.println("전공 : " + major);
		System.out.println("학번 : " + year);
	}
	public void universePrint() {
		System.out.println("대학 동창 목록");
	}

}
