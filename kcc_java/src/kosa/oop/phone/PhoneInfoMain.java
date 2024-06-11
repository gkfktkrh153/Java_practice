package kosa.oop.phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneInfoMain {

	public static void main(String[] args) {
		Manager manager = new Manager();

		while (true) {
			System.out.println("1.추가 2." + "전체출력 3.검색 4.수정 5.삭제 6.정렬 7.저장 8.불러오기 9.종료");
			System.out.print("메뉴 입력: ")
			;
			String menu = DataInput.sc.nextLine();

			switch (menu) {
			case "1":
				manager.addPhoneInfo();
				break;
			case "2":
				manager.listPhoneInfo();
				break;
			case "3":
				try {
					manager.searchPhoneInfo();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case "4":
				try {
					manager.updatePhoneInfo();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case "5":
				try {
					manager.deletePhoneInfo();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case "6":
				manager.sortPhoneInfo();
				break;
			case "7": // 데이터 저장
				manager.writePhoneInfo();
				break;
			case "8": // 데이터 불러오기
				manager.readPhoneInfo();
				break;
			case "9":
				System.out.println("프로그램 종료");
				return;
			}
		}
	}
}