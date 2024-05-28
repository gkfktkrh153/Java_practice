package kosa.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneInfoMain {
	
    static Scanner sc = new Scanner(System.in);
	static int phoneInfoNum = 0;
	
	public static void main(String[] args) {

		
		PhoneInfo[] phoneInfoArr = new PhoneInfo[10];
	      
	      boolean flag = true;
	      while(flag) {
	         System.out.println("1.�߰� 2.��ü ��� 3.�˻� 4.����: ");
	         System.out.print("�޴�: ");
	         int input = Integer.parseInt(sc.nextLine());
	         switch(input) {
	            case 1:
	            	try {
		            	addPhoneInfo(phoneInfoArr);
	            	}catch(Exception ex){
					/* System.out.println(ex.getMessage()); */
	            		ex.printStackTrace();
	            	}
	            	finally {
	            		System.out.println("���� ����");
	            	}
	               break;
	            case 2:
	            	listPhoneInfo(phoneInfoArr);
	               break;
	            case 3:
	               System.out.print("�˻�: ");	               
	               break;
	            case 4:
	            	System.out.println("���α׷� ����");
	               return;
	         }
	         //sc.nextLine();
	      }

	}

	private static void listPhoneInfo(PhoneInfo[] phoneInfoArr) {
        for(int i = 0; i < phoneInfoNum; i++) {
     	   phoneInfoArr[i].printPhoneInfo();
        }
	}

	private static void addPhoneInfo(PhoneInfo[] phoneInfoArr) throws Exception {
		
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
