package kosa.mission2;

import java.util.Arrays;
import java.util.Scanner;

public class Mission2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] numbers = new int[N];
		for (int i = 0; i < N; i++) {
			numbers[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			if (i == 0)
				System.out.print(numbers[i] + " ");
			else {
				if (numbers[i - 1] < numbers[i])
					System.out.print(numbers[i] + " ");
			}
		}

		
		/* 선생님이 볼 수 있는 학생 수
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int N = sc.nextInt(); int[] student = new int[N]; for (int i = 0; i < N; i++)
		 * { student[i] = sc.nextInt(); }
		 * 
		 * int a = 0; // 현재 가장 큰 사람 int result = 0; for (int i = 0; i < N; i++) {
		 * 
		 * if (a < student[i]) { a = student[i]; result++; } }
		 * System.out.println(result);
		 */
	}

}
