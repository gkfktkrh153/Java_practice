package kosa.mission;

import java.util.Scanner;

public class Mission04 {

	public static void main(String[] args) {
		/*
		 *  �� ������ ������ ���ڿ��� �޾� 
		 *  ��Ģ ���� ����� ���
		 */
		 
		Scanner sc = new Scanner(System.in);
		System.out.print("����1 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("����2 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("������ : ");
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
		
		
		System.out.println("���> " + result);
	}

}
