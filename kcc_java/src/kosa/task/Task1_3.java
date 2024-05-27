package kosa.task;

import java.util.Scanner;

public class Task1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("number = ");
		int n = Integer.parseInt(sc.nextLine());
		
		
		for(int i = 0; i < n; i++) { 
			for(int j = 0; j <= n - 1; j++)
				System.out.printf("%3d", (10 * i) + 1 + j * 2);
			System.out.println();
		}
	}

}
