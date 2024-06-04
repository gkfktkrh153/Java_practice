package kosa.api;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Date now = new Date(); System.out.println(now.toString());
		 * 
		  
		 * System.out.println(sdf.format(now));
		 * 
		 */
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		
		System.out.print("날짜 입력");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		Date date = null;
		Date now = new Date();
		
		// a < b(1 ~ 6)  ==> b - a
		// a > b(6 ~ 4, 11 ~ 5) ==> 12 - a + b 
		int month = 0;
		int year =0;
		
		try {
			date = df.parse(input);
			int currentMonth = now.getMonth();
			int joinMonth = date.getMonth();
			
			year = date.getYear() - now.getYear();
			if(joinMonth < currentMonth)
				month = currentMonth - joinMonth;
			else {
				month = 12 - joinMonth + currentMonth;
			}
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("입사한지 " + year + "년 " + month + "개월");
 
	}

}
