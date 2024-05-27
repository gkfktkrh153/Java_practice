package kosa.task;

import java.util.Scanner;

public class Task2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("number = ");
		int n = Integer.parseInt(sc.nextLine());
		
		
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.printf("%c", '*');
			}
			System.out.println();
		}
	}

}
