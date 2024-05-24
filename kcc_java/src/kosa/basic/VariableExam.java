package kosa.basic;

import java.util.Scanner;

public class VariableExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num  = Integer.parseInt(sc.nextLine());

				
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		System.out.println(str);
		System.out.println(num);
	}

}
