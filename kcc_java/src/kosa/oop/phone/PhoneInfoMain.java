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
			System.out.println("1.�߰� 2.��ü ��� 3.�˻� 4.����: ");
			System.out.print("�޴�: ");
			int input = Integer.parseInt(sc.nextLine());
			switch (input) {
			case 1:
				try {
					manager.addPhoneInfo();
				} catch (Exception ex) {
					/* System.out.println(ex.getMessage()); */
					ex.printStackTrace();
				} finally {
					System.out.println("���� ����");
				}
				break;
			case 2:
				manager.listPhoneInfo();
				break;
			case 3:
				System.out.print("�˻�: ");
				break;
			case 4:
				System.out.println("���α׷� ����");
				return;
			}
		}

	}

}
