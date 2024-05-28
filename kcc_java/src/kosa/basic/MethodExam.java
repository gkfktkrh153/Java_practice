package kosa.basic;

public class MethodExam {

	
	//메서드 정의
	// 접근 제어자, (static), return type, 메서드명(파라미터)
	
	public static void printChracter(char c, int n){
		for(int i = 0; i < n; i++) {
			System.out.print(c);
		}
	}
	public static int add(int num1, int num2) {
		return num1 + num2;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printChracter('#', 5);
		

	}

}
