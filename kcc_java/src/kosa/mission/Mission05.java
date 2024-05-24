package kosa.mission;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		/*
		 *  두 정수와 연산자 문자열을 받아 
		 *  사칙 연산 결과를 출력
		 */
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * 
		 * 
		 * while(true) { System.out.println("메뉴를 선택해 주세요 : 1.추가 2.출력 3.검색 4.종료");
		 * System.out.print("> "); int menu = Integer.parseInt(sc.nextLine());
		 * 
		 * 
		 * switch(menu) { case 1: sc.nextLine() System.out.println("추가"); break; case 2:
		 * System.out.println("출력"); break; case 3: System.out.println("검색"); break;
		 * case 4: System.out.println("프로그램 종료"); return; }
		 * 
		 * 
		 * }
		 */

		
		 List<String> arr = new ArrayList<>();
	      Scanner sc = new Scanner(System.in);
	      
	      boolean flag = true;
	      while(flag) {
	         System.out.println("1.추가 2.출력 3.검색 4.종료: ");
	         System.out.print("입력: ");
	         int input = Integer.parseInt(sc.nextLine());
	         switch(input) {
	            case 1:
	               System.out.print("추가: ");
	               String str1 = sc.nextLine();
	               arr.add(str1);
	               break;
	            case 2:
	               arr.forEach(str -> System.out.println(str));
	               break;
	            case 3:
	               System.out.print("검색: ");
	               System.out.println(arr.get(Integer.parseInt(sc.nextLine())));
	               break;
	            case 4:
	               return;
	         }
	         //sc.nextLine();
	      }

	}

}
