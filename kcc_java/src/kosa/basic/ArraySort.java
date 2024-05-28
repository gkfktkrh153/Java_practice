package kosa.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 1차원 정렬
		 * int arr[] = { 3, 2, 5 }; Arrays.sort(arr); System.out.println(arr);
		 * 
		 * for (int i = arr.length - 1; i >= 0; i--) { System.out.println(arr[i]); }
		 */
		
		int arr2[][] = {{2,90}, {1,60},{3,20}};
		Arrays.sort(arr2, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// 정렬 기준
				if(o1[0] < o2[0])
				{
					return -1; // 안바꿔도 될 떄는 음수
				}
				else if(o1[0] < o2[0])
				{
					return 1; // 바꿔야할 때는 양수
				}
				return 0;
			}
		});
		
		System.out.println(Arrays.deepToString(arr2));
	}

}
