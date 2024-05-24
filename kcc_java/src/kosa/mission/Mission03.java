package kosa.mission;

import java.util.Scanner;

public class Mission03 {

	public static void main(String[] args) {
		// 5ÀÚ¸® ¼ö ¼ýÀÚÀÇ ÀÚ¸® ¼ö Áß Â¦¼ö¿Í È¦¼ö °³¼ú
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int odd = 0;// È¦¼ö
		int even = 0;// Â¦¼ö
		while(n > 0){
			
			//12345 % 10 == 5
			
			int mod = n % 10;
			if(mod % 2 == 0)
				even += 1;
			else
				odd += 1;
			
			n /= 10;
		}
		System.out.println("È¦¼ö : " + odd);
		System.out.println("Â¦¼ö : " + even);
		
	}

}
