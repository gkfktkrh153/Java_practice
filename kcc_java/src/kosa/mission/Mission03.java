package kosa.mission;

import java.util.Scanner;

public class Mission03 {

	public static void main(String[] args) {
		// 5�ڸ� �� ������ �ڸ� �� �� ¦���� Ȧ�� ����
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int odd = 0;// Ȧ��
		int even = 0;// ¦��
		while(n > 0){
			
			//12345 % 10 == 5
			
			int mod = n % 10;
			if(mod % 2 == 0)
				even += 1;
			else
				odd += 1;
			
			n /= 10;
		}
		System.out.println("Ȧ�� : " + odd);
		System.out.println("¦�� : " + even);
		
	}

}
