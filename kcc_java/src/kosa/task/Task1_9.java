package kosa.task;

import java.util.Scanner;

public class Task1_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("number = ");
		int n = Integer.parseInt(sc.nextLine());
		
		

		for(int i = 0; i < n; i++) {  // 0 ~ 4   -> 4 ~ 0
			for(int j = 0; j < n; j++)
				System.out.printf("%3d", (i + j) % n + 1);
			System.out.println();
		}
	}

}
