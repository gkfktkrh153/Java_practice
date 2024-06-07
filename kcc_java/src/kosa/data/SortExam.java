package kosa.data;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

public class SortExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		TreeSet<Integer> set = new TreeSet<Integer>(new Comparator<>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1 < o2)
					return 1;
				else if(o1 > o2)
					return -1;
				return 0;
			}
		});

		for (int i = 0; set.size() < 6; i++) {
			set.add(r.nextInt(45) + 1);
		}
		System.out.println(set);
	}

}
