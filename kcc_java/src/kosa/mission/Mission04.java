package kosa.mission;

import java.util.Scanner;

public class Mission04 {

	public static void main(String[] args) {
		/*
		 *  두 정수와 연산자 문자열을 받아 
		 *  사칙 연산 결과를 출력
		 */
		 
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("정수2 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("연산자 : ");
		String op = sc.nextLine();
		
		double result = 0;
		
		if(op.equals("+"))
			result = num1 + num2;
		else if(op.equals("-"))
			result = num1 - num2;
		else if(op.equals("*"))
			result = num1 * num2;
		else if(op.equals("/"))
			result = num1 / num2;
		
		
		System.out.println("결과> " + result);
	}

}
