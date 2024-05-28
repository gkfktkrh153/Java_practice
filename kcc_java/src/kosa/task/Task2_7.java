package kosa.task;

import java.util.Scanner;

public class Task2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("number = ");
		int number = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= number; i++) {
			for (int h = 0; h < (number * 2) + (number - 1); h++) {
				System.out.print(" ");
			}
			
			for (int j = number - i; j > 0; j--) {
				System.out.print(" ");
			}

			for (int h = 0; h < i + i - 1; h++) {
				System.out.print("*");
			}

			for (int j = number - i; j > 0; j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = 1; i <= number; i++) {

			for (int j = number - i; j > 0; j--) {
				System.out.print(" ");
			}

			for (int h = 0; h < i + i - 1; h++) {
				System.out.print("*");
			}

			for (int j = number - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = number - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < number; j++) {
				System.out.print("*");
			}

			for (int h = 0; h < i + i - 1; h++) {
				System.out.print("*");
			}
			for (int j = 0; j < number; j++) {
				System.out.print("*");
			}
			for (int j = number - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = number - i; j > 0; j--) {
				System.out.print(" ");
				
			}
			for (int h = 0; h < i + i - 1; h++) {
				System.out.print("*");
			}
			for (int j = number - i; j > 0; j--) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
