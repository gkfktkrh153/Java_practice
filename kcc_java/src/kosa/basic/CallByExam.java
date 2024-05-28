package kosa.basic;

public class CallByExam {

	
	public static void change(int num) { // 값에 의한 호출
		num += 10;
	}
	public static void change2(int[] numArr) { // 참조에 의한 호출
		numArr[0] = 10;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abc";
		String str2 = str1; 
		
		str2 = "abcd";
		// String은 불변객체
		// "abcd" 는 상수풀에 없기 때문에 생성 후 참조
		
		System.out.println(str1);
		System.out.println(str2);
		
	}

}
