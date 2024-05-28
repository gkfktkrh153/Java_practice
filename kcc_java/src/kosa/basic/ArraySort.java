package kosa.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 1���� ����
		 * int arr[] = { 3, 2, 5 }; Arrays.sort(arr); System.out.println(arr);
		 * 
		 * for (int i = arr.length - 1; i >= 0; i--) { System.out.println(arr[i]); }
		 */
		
		int arr2[][] = {{2,90}, {1,60},{3,20}};
		Arrays.sort(arr2, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// ���� ����
				if(o1[0] < o2[0])
				{
					return -1; // �ȹٲ㵵 �� ���� ����
				}
				else if(o1[0] < o2[0])
				{
					return 1; // �ٲ���� ���� ���
				}
				return 0;
			}
		});
		
		System.out.println(Arrays.deepToString(arr2));
	}

}
