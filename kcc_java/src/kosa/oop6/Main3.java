package kosa.oop6;


interface AA{
	BB abc();
}
class BB{
	BB(){
		System.out.println("BB 생성자");
	}
}

public class Main3 {

	public static void main(String[] args) {
		// 1. 익명내부 클래스
		AA a1 = new AA() {

			@Override
			public BB abc() {
				// TODO Auto-generated method stub
				return new BB();
			}
			
		};
		a1.abc();
		
		AA a2 = () -> {
			return new BB();
		};
		
		
		
		
	}

}
