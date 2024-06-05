package kosa.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		String data[] = { "bat", "bba", "bbg", "bonus", "CA", "ca", "c232", "car", "date", "dic", "diraaa", "d" };

		Pattern p = Pattern.compile("d[a-z]*");

		for (String str : data) {
			Matcher matcher = p.matcher(str);
			if (matcher.matches())
				System.out.println(str);
		}

		Pattern source = Pattern.compile("ab?cd?ef?gh");
		String reg = "(\\w*)";
*/
		String source = "HP: 010-1111-1111, HOME: 02-222-2222";
		String reg = "[\\p{Digit}]{2,3}-[\\p{Digit}]{3,4}-[\\p{Digit}]{4}";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(source);
		
		while(m.find()) {
			System.out.println(m.group());
		}
	}

}
