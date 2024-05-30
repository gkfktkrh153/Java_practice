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
		
        System.out.print("�̸�: ");
        String name = sc.nextLine();
        System.out.print("��ȭ��ȣ: ");
        String phoneNumber = sc.nextLine();
        System.out.print("�������: ");
        String birth = sc.nextLine();
        
        if(phoneInfoNum == 1)
        	throw new Exception("��ȭ��ȣ�ΰ� ���� �� �ֽ��ϴ�.");

        phoneInfoArr[phoneInfoNum++] = new PhoneInfo(name, phoneNumber, birth);
	}

}
