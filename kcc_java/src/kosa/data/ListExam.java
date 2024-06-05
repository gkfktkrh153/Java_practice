package kosa.data;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class ListExam {

	public static void main(String[] args) {
		/*
		 * // 로또 구현(배열) int[] arr = new int[6];
		 * 
		 * int arrSize = 0; while (arrSize < 6) { int rand = (int) (Math.random() * 45)
		 * + 1; boolean flag = true; for (int i = 0; i < 6; i++) { if (arr[i] == rand)
		 * flag = false; } if (flag == false) continue; arr[arrSize] = rand; arrSize++;
		 * } System.out.println(Arrays.toString(arr));
		 */
		
		/*
		 * // 로또 구현(List) List<Integer> list = new ArrayList<Integer>();
		 * 
		 * while(list.size() < 6) { int n = (int)(Math.random() * 45) + 1;
		 * if(list.contains(n)) { continue; } else { list.add(n);
		 * 
		 * } } Collections.sort(list); System.out.println(list.toString());
		 */
		
		/*
		 * // 로또 구현(Set) Set<Integer> set = new TreeSet<Integer>();
		 * 
		 * while(set.size() < 6) { int n = (int)(Math.random() * 45) + 1; set.add(n); }
		 * 
		 * System.out.println(set.toString());
		 */
		
		
		
	}

}
