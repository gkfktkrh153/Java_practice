package kosa.task;

import java.util.Scanner;

public class Task1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("number = ");
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i = n - 1; i >= 0; i--) {
			for(int j = 1; j <= n; j++)
				System.out.printf("%3d", i * n + j);
			System.out.println();
		}
	}

}
