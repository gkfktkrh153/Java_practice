package kosa.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExam {

	public static void main(String[] args) {
		/*
		 * // 병렬 처리 스트림 Set<String> set = new HashSet<>(); set.add("홍길동");
		 * set.add("홍길두"); set.add("홍길덕"); set.parallelStream().forEach(name ->
		 * System.out.println(name + " | " + Thread.currentThread().getName()));
		 */
		
	 
		//List<Person> person = Arrays.asList(new Person("홍길동", 15), new Person("홍길덕", 67), new Person("홍길두", 38));
		List<String> list = Arrays.asList("10, 20, 30", "40, 50");
		
		Stream<String> toStringStream = list.stream().flatMap(data -> Arrays.stream(data.split(", ")));
		
		IntStream toIntStream = list.stream().flatMapToInt(data -> {
			String[] split = data.split(", ");
			int[] intArr = new int[split.length];
			
			for(int i = 0 ; i < split.length; i++) {
				intArr[i] = Integer.parseInt(split[i]);
			}
			return Arrays.stream(intArr);
		});
	}
	
	

}
