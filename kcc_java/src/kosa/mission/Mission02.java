package kosa.mission;

import java.util.Scanner;

public class Mission02 {

	public static void main(String[] args) {
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
		
		
		int total = korea + english + math;
		float average = total / 3.0f;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
		
		// 학점 출력(if-else)
		
		/*
		 * if(average >= 90) System.out.println("A 학점"); else if(average >= 80)
		 * System.out.println("B 학점"); else if(average >= 70)
		 * System.out.println("C 학점"); else if(average >= 60)
		 * System.out.println("D 학점"); else System.out.println("F 학점");
		 */
		
		// 학점 출력(Switch)
		switch((int)average / 10) {
			case 9:
				System.out.println("A 학점");
				break;
			case 8:
				System.out.println("B 학점");
				break;
			case 7:
				System.out.println("C 학점");
				break;
			case 6:
				System.out.println("D 학점");
				break;
			default:
				System.out.println("F 학점");
			
		}
		
	}

}
