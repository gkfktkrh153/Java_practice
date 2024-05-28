package kosa.mission;

import java.util.Scanner;

public class Mission2_1 {

	public static void handleTotal(int[] score) {
		score[4] = score[0] + score[1] + score[2];
	}
	public static void handleAverage(int[] score, int total) {
		score[5] = total / 3;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		int[] score = new int[] {korea, english, math, 0, 0}; // total average
		
		handleTotal(score);
		handleAverage(score, score[4]);
		
		System.out.println("���� : " + score[4]);
		System.out.println("��� : " + score[5]);
	}

}
