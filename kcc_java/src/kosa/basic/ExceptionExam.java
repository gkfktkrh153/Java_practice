package kosa.basic;

public class ExceptionExam {

	public static void noEquals(int a, int b) {
		try {

			if(a == b) {
				throw new Exception("같은 값 안돼");
			}	
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("함수 종료");
		}
	}
	
	public static void main(String[] args) {
	//	noEquals(1, 2);
	
		try {
			System.out.println("1");
			noEquals(10, 10);
			System.out.println("2");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("3");
		}
		finally {
			System.out.println("4");
		}
		System.out.println("5");
		
		// 1 2 4 5
	}

}
