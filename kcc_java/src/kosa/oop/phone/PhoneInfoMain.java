package kosa.oop.phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneInfoMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Manager manager = new Manager();

		boolean flag = true;
		while (flag) {
			System.out.println("1.추가 2.전체 출력 3.검색 4.종료: ");
			System.out.print("메뉴: ");
			int input = Integer.parseInt(sc.nextLine());
			switch (input) {
			case 1:
				try {
					manager.addPhoneInfo();
				} catch (Exception ex) {
					/* System.out.println(ex.getMessage()); */
					ex.printStackTrace();
				} finally {
					System.out.println("예외 종료");
				}
				break;
			case 2:
				manager.listPhoneInfo();
				break;
			case 3:
				System.out.print("검색: ");
				break;
			case 4:
				System.out.println("프로그램 종료");
				return;
			}
		}

	}

}
