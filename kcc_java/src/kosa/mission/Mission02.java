package kosa.mission;

import java.util.Scanner;

public class Mission02 {

	public static void main(String[] args) {
		// ��������
		// ����, ����, ���� ������ Ű�� �Է�
		// ������ ��� ��� (����� �Ǽ���)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� �Է� : ");
		int korea = Integer.parseInt(sc.nextLine());
		System.out.print("���� ���� �Է� : ");
		int english = Integer.parseInt(sc.nextLine());
		System.out.print("���� ���� �Է� : ");
		int math = Integer.parseInt(sc.nextLine());
		
		
		int total = korea + english + math;
		float average = total / 3.0f;
		
		System.out.println("���� : " + total);
		System.out.println("��� : " + average);
		
		// ���� ���(if-else)
		
		/*
		 * if(average >= 90) System.out.println("A ����"); else if(average >= 80)
		 * System.out.println("B ����"); else if(average >= 70)
		 * System.out.println("C ����"); else if(average >= 60)
		 * System.out.println("D ����"); else System.out.println("F ����");
		 */
		
		// ���� ���(Switch)
		switch((int)average / 10) {
			case 9:
				System.out.println("A ����");
				break;
			case 8:
				System.out.println("B ����");
				break;
			case 7:
				System.out.println("C ����");
				break;
			case 6:
				System.out.println("D ����");
				break;
			default:
				System.out.println("F ����");
			
		}
		
	}

}
