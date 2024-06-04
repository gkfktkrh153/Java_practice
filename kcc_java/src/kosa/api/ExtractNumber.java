package kosa.api;

import java.util.Scanner;

public class ExtractNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = (sc.nextLine()).toUpperCase();
		String findString = (sc.nextLine()).toUpperCase();
		int count = 0;
		
		for(int i = 0; i < inputString.length(); i++)
			if(inputString.charAt(i) == findString.charAt(0))
				count++;
		
		System.out.println(count);
		
		
	}

}
