package kosa.thread;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		for(int i = 0 ; i< 10000; i++) {
			list.add(i);
		}
		
		list.parallelStream().forEach(System.out::println);
	}

}
