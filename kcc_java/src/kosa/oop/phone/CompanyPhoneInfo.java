package kosa.oop.phone;

public class CompanyPhoneInfo extends PhoneInfo {
	private String dept;
	private String position;

	CompanyPhoneInfo() {

	}

	public CompanyPhoneInfo(String name, String phoneNumber, String birth, String dept, String position) {
		super(name, phoneNumber, birth);
		this.dept = dept;
		this.position = position;

	}

	public void printPhoneInfo() {
		super.printPhoneInfo();
		System.out.println("부서 : " + dept);
		System.out.println("직급 : " + position);
	}
	public void companyPrint() {
		System.out.println("회사 동룍 목록");
	}

}
