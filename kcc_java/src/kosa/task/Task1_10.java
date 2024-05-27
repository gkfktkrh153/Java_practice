package kosa.task;

import java.util.Scanner;

public class Task1_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("number = ");
		int n = Integer.parseInt(sc.nextLine());
		
		

		int num = 1;
		for(int i = 0; i < n; i++) { // n = 5 => 5 10 15
			for(int j = n - i; j > 1; j--) { // 4 3 2 1 0
				System.out.printf("%3c", ' ');
				//System.out.print("ฐ๘น้ ");
			}
			
			for(int j = 0; j <= i; j++) { // 0 1 2 3 4
				System.out.printf("%3d",num++);
			}
			System.out.println();
			
		}
	}

}
