package kosa.basic;

import java.util.HashSet;

public class LoopExam02 {

	public static void main(String[] args) {

		/*
		 * for (int i = 2; i <= 9; i++) { for (int j = 1; j < 10; j++) {
		 * System.out.println(i + " * " + j + " = " + j*i); } }
		 * 
		 */
		
		/*
		for(int x = 0; x <= 15; x++) {
			for(int y = 0; y <= 12; y++) {
				if(4 * x + 5 * y == 60)
					System.out.println("x : " + x + " y : " + y);
			}
		}
		*/
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 5; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
