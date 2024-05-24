package kosa.basic;

import java.util.HashSet;

public class LoopExam01 {

	public static void main(String[] args) {

		/*
		 * for문 예제
		 * int sum = 0;
		 * 
		 * int i = 0; while(i <= 10) { sum += i; i++; }
		 * System.out.println("1~10까지의 합 : " + sum);
		  
		  
		 * for(int i = 1; i <= 100; i++) {
		 *	
         *	if(i % 2 == 0 || i % 3 == 0)
		 *		continue;
		 *	System.out.println(i);
		
		 * while문 예제 
		 
		 * int i = 1; while(i <= 9) {
		 * System.out.println("7 * " + i + " = " + 7 * i); i++; }
		
		
		
	     * b - a 출력
	     
		 * int a,b = 0; Scanner sc = new Scanner(System.in); do {
		 * System.out.print("b 입력 > "); b = Integer.parseInt(sc.nextLine());
		 * System.out.print("a 입력 > "); a = Integer.parseInt(sc.nextLine()); }while(b <
		 * a);
		 * 
		 * System.out.println("b - a = " + (b - a));
		 */
		
		
		// 난수 개 받아서 서로 중첩되지 않고 출력
		
		HashSet<Integer> hashSet = new HashSet<>();
		
		int count = 0;
		while(count < 3) {
			int n = (int)(Math.random() * 9) + 1;
			

			if(!hashSet.contains(n)) {
				hashSet.add(n);
				count++;
			}
			
		}
		hashSet.forEach(n -> System.out.println(n));
		
	}

}
