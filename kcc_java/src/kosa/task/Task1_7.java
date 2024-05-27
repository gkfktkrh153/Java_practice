package kosa.task;

import java.util.Scanner;

public class Task1_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("number = ");
		int n = Integer.parseInt(sc.nextLine());
		
		

		for(int i = n; i > 0; i--) { // n = 5 => 5 10 15
			for(int j = 1; j <= i; j++) {
				System.out.printf("%3d",j);
			}
			System.out.println();
		}
	}

}
