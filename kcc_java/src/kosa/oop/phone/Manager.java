package kosa.oop.phone;

import java.util.Scanner;

public class Manager {
	PhoneInfo[] phoneInfoArr;
	int phoneInfoNum = 0;
    Scanner sc;
	
    public Manager() {
    	phoneInfoArr = new PhoneInfo[10];
    	sc = new Scanner(System.in);
    }
    
	public void listPhoneInfo() {
        for(int i = 0; i < phoneInfoNum; i++) {
     	   phoneInfoArr[i].printPhoneInfo();
        }
	}

	public void addPhoneInfo() throws Exception {
		
        System.out.print("이름: ");
        String name = sc.nextLine();
        System.out.print("전화번호: ");
        String phoneNumber = sc.nextLine();
        System.out.print("생년월일: ");
        String birth = sc.nextLine();
        
        if(phoneInfoNum == 1)
        	throw new Exception("전화번호부가 가득 차 있습니다.");

        phoneInfoArr[phoneInfoNum++] = new PhoneInfo(name, phoneNumber, birth);
	}
	public void searchPhoneInfo() {
		System.out.println("이름: ");
		String name = sc.nextLine();
		int idx = -1;
		
		for(int i = 0; i < phoneInfoNum; i++) {
			if(name.contentEquals(phoneInfoArr[i].getName()))
				phoneInfoArr[i].printPhoneInfo();
		}
		if(idx == -1)
			System.out.println("존재하지 않습니다.");
	}

}
