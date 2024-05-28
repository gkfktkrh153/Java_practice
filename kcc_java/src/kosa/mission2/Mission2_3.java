package kosa.mission2;

import java.util.Arrays;
import java.util.Scanner;

public class Mission2_3 {
		
	public static void main(String[] args) {
		// 격자 판 최대 합
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[][] arr = new int[n][n];
		int[] sum = new int[n * 2 + 2];
		
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
				if(i == j) {// 왼쪽 대각선 (0,0) (1,1) (2,2) (3,3) (4,4)
					sum[2 * n] += arr[i][j]; 

				}
				if(i + j == n - 1) // 오른쪽 대각선 (0,4) (1,3) (2,2) (3,1) (4,0)
					sum[2 * n + 1] += arr[i][j]; 

			}
		}
		
		
		for(int i = 0; i < n; i++) {			 
			for(int j = 0; j < n; j++) { // 
				sum[i] += arr[i][j]; // i 행의 합(가로) | 0 ~ n - 1
				sum[i + n] += arr[j][i]; // i열의 합(세로) | n ~ 2n - 1
			}
		}
		
		System.out.println(Arrays.toString(sum));		
		Arrays.sort(sum);

		System.out.println(sum[sum.length - 1]);
		
	}

}
