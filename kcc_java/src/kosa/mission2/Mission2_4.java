package kosa.mission2;

import java.util.Arrays;
import java.util.Scanner;

public class Mission2_4 {
		
	public static void handle(int a, int b, int i) { // a는 종현 b는 종원 
		int n = 0;
		while(true) {
			if(a < b) {
				System.out.printf("#%d %d", i + 1, n);
				break;
			}
			a *= 2;
			b *= 3;
			n++;
		}
	}
	public static void main(String[] args) {
		// 종원이는 언제 종현이를 따라잡을까
		

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			handle(a, b, i);
		}
	}
}
