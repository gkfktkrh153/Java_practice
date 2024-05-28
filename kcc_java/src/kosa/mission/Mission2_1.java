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
		// 성적관리
		// 국어, 영어, 수학 점수를 키드 입력
		// 총점과 평균 출력 (평균은 실수형)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 : ");
		int korea = Integer.parseInt(sc.nextLine());
		System.out.print("수학 점수 입력 : ");
		int english = Integer.parseInt(sc.nextLine());
		System.out.print("영어 점수 입력 : ");
		int math = Integer.parseInt(sc.nextLine());
		
		int[] score = new int[] {korea, english, math, 0, 0}; // total average
		
		handleTotal(score);
		handleAverage(score, score[4]);
		
		System.out.println("총점 : " + score[4]);
		System.out.println("평균 : " + score[5]);
	}

}
