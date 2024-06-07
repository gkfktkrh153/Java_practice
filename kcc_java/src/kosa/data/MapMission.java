package kosa.data;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Stream;

public class MapMission {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		map.put("김자바", 80);
		map.put("나자바", 90);
		map.put("박자바", 20);
		map.put("이자바", 30);
		
		System.out.println("응시자 목록");
		for(String key : map.keySet()) {
			System.out.println(key);
			sum += map.get(key);
		}
		
		System.out.println("총점 : " + sum);
		System.out.println("최고점 : " + Collections.max(map.values()));
		System.out.println("최저점 : " + Collections.min(map.values()));
		System.out.println("평균 : " + sum / map.size());
		
	}

}
