package kosa.basic;

import java.util.Scanner;

public class ArrayExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{1,2,3,4,5};
		
		/*
		 *  �迭 ��� ���
		 *  1. �迭�� ���� ������ Ÿ���� �����Ѵ�.
		 *  2. �迭�� ũ�⸦ ���� => ArrayIndexOfBoundsException ���� �߻�
		 *  3. �迭 ���� ��� ����
		 *  4. �迭�� ��� �ʱ�ȭ => ���� �ε��� ����, for��, ������ �ʱ�ȭ
		 *  5. �迭�� ������ ��� ��� => for��, ���� for��, �����ε���
		 */
		
		// ���ڿ� �Է� �� �迭�� �߰� => ��ü ���
		
		Scanner sc = new Scanner(System.in);
		String[] strArr = new String[100];
		String input = "";
		int n = 0;
		while (true){
			input = sc.nextLine();
			if(input.equals("q"))
				break;
			strArr[n++] = input;

		}

		
		for(int i = 0; i < n; i++) {
			System.out.print(strArr[i] + " ");
				
		}
	}

}
