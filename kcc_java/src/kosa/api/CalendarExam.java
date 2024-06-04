package kosa.api;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExam {

	public static void main(String[] args) {
		// GregorianCalendar gc = new GregorianCalendar();

		Calendar c = Calendar.getInstance();

		c.set(2024, 1, 14);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		for (int i = 0; i <= 6; i++) {
			System.out.println(sdf.format(c.getTime()));
			switch (c.get(Calendar.DAY_OF_WEEK)) {
			case 1:
				System.out.println("일요일");
				break;
			case 2:
				System.out.println("월요일");
				break;
			case 3:
				System.out.println("화요일");
				break;
			case 4:
				System.out.println("수요일");
				break;
			case 5:
				System.out.println("목요일");
				break;
			case 6:
				System.out.println("금요일");
				break;
			case 7:
				System.out.println("토요일");
				break;
			}
			c.add(c.YEAR, 1);
		}

	}

}
