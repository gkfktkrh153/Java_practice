package kosa.mission;

import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		/*
		 *  �� ������ ������ ���ڿ��� �޾� 
		 *  ��Ģ ���� ����� ���
		 */
		 
		Scanner sc = new Scanner(System.in);
		

		
		while(true) {
			System.out.println("�޴��� ������ �ּ��� : 1.�߰� 2.��� 3.�˻� 4.����");
			System.out.print("> ");
			int menu = Integer.parseInt(sc.nextLine());
				
			
			switch(menu) {
			case 1:
				System.out.println("�߰�");
				break;
			case 2:
				System.out.println("���");
				break;
			case 3:
				System.out.println("�˻�");
				break;
			case 4:
				System.out.println("���α׷� ����");
				return;
			}
			
					
		}


		

	}

}
