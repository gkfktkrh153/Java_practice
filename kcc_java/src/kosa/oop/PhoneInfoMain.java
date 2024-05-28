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
	         System.out.println("1.추가 2.전체 출력 3.검색 4.종료: ");
	         System.out.print("메뉴: ");
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
	            		System.out.println("예외 종료");
	            	}
	               break;
	            case 2:
	            	listPhoneInfo(phoneInfoArr);
	               break;
	            case 3:
	               System.out.print("검색: ");	               
	               break;
	            case 4:
	            	System.out.println("프로그램 종료");
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

}
