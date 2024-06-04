package kosa.api;

import java.util.Scanner;

public class LongWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inputString = (sc.nextLine());
		String longString = "";
		for(String str : inputString.split(" "))
		{
			if(longString.length() < str.length())
				longString = str;
		}
		System.out.println(longString);
	}

}
