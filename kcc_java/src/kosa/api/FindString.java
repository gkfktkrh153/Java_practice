package kosa.api;

import java.util.Scanner;

public class FindString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = (sc.nextLine()).toUpperCase();

		String result = "";
		for(int i = 0; i < inputString.length(); i++) {
			if( Character.isDigit(inputString.charAt(i)) == true) {
				if(inputString.charAt(i) == '0' && result.length() == 0)
					continue;
				result += inputString.charAt(i);
			}
				
		}
		System.out.println(result);	
		
	}

}
