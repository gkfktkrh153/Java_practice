package kosa.api;

import java.util.Scanner;

public class RegularExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		/*
		 * if(str.matches(".*abc.*")) System.out.println("매칭"); else
		 * System.out.println("비매칭");
		 */

		/*
		 * // 알파벳, 숫자만 5자리 이상 if (str.matches("[\\w]{5,}")) System.out.println("매칭");
		 * else System.out.println("비매칭");
		 */

		/*
		 * // 한글 3~5 if (str.matches("[가-힣]{3,5}")) System.out.println("매칭"); else
		 * System.out.println("비매칭");
		 */

		// 숫자 먼저 오면 안됨
		// @없으면 안됨
		// nate.com 으로 끝나지 않으면
		if (str.matches("^[\\p{Alpha}][\\w]*@[\\p{Alpha}]+\\.{1}[\\p{Alpha}]{3}"))  
			System.out.println("매칭");
		else
			System.out.println("비매칭");

	}

}
