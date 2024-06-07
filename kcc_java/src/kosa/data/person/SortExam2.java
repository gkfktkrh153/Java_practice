package kosa.data.person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list = new ArrayList<Person>();

		list.add(new Person("홍길동", 80));
		list.add(new Person("박길동", 10));
		list.add(new Person("강길동", 50));

		System.out.println("가".compareTo("나"));
		System.out.println("나".compareTo("가"));

		Collections.sort(list, new Comparator<>() {

			@Override
			public int compare(Person o1, Person o2) {
				System.out.println("o1 : " + o1.getName() + " o2 : " + o2.getName());
				if (o1.getName().compareTo(o2.getName()) > 0) // 나 가
					return 1; // 바꾼다.
				else if (o1.getName().compareTo(o2.getName()) < 0) // 가 나
					return -1; // 가만히
				return 0;
			}

		});
		for (Person p : list) {
			System.out.println(p.toString());
		}
	}

}
