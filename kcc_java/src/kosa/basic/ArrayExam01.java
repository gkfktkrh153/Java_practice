package kosa.basic;

import java.util.Scanner;

public class ArrayExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{1,2,3,4,5};
		
		/*
		 *  배열 사용 방법
		 *  1. 배열에 사용될 데이터 타입을 결정한다.
		 *  2. 배열의 크기를 결정 => ArrayIndexOfBoundsException 예외 발생
		 *  3. 배열 생성 방법 선택
		 *  4. 배열을 어떻게 초기화 => 직접 인덱스 접근, for문, 생성과 초기화
		 *  5. 배열의 데이터 어떻게 출력 => for문, 향상된 for문, 직접인덱스
		 */
		
		// 문자열 입력 후 배열에 추가 => 전체 출력
		
		Scanner sc = new Scanner(System.in);
		String[] strArr = new String[100];
		String input = "";
		int n = 0;
		while (true){
			input = sc.nextLine();
			if(input.equals("q"))
				break;
			strArr[n++] = input;

		}

		
		for(int i = 0; i < n; i++) {
			System.out.print(strArr[i] + " ");
				
		}
	}

}
