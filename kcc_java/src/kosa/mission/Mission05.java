package kosa.mission;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		/*
		 *  �� ������ ������ ���ڿ��� �޾� 
		 *  ��Ģ ���� ����� ���
		 */
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * 
		 * 
		 * while(true) { System.out.println("�޴��� ������ �ּ��� : 1.�߰� 2.��� 3.�˻� 4.����");
		 * System.out.print("> "); int menu = Integer.parseInt(sc.nextLine());
		 * 
		 * 
		 * switch(menu) { case 1: sc.nextLine() System.out.println("�߰�"); break; case 2:
		 * System.out.println("���"); break; case 3: System.out.println("�˻�"); break;
		 * case 4: System.out.println("���α׷� ����"); return; }
		 * 
		 * 
		 * }
		 */

		
		 List<String> arr = new ArrayList<>();
	      Scanner sc = new Scanner(System.in);
	      
	      boolean flag = true;
	      while(flag) {
	         System.out.println("1.�߰� 2.��� 3.�˻� 4.����: ");
	         System.out.print("�Է�: ");
	         int input = Integer.parseInt(sc.nextLine());
	         switch(input) {
	            case 1:
	               System.out.print("�߰�: ");
	               String str1 = sc.nextLine();
	               arr.add(str1);
	               break;
	            case 2:
	               arr.forEach(str -> System.out.println(str));
	               break;
	            case 3:
	               System.out.print("�˻�: ");
	               System.out.println(arr.get(Integer.parseInt(sc.nextLine())));
	               break;
	            case 4:
	               return;
	         }
	         //sc.nextLine();
	      }

	}

}
