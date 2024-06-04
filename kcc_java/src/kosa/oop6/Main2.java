package kosa.oop6;


interface A{
	void abc();
}

class B{
	void bcd() {
		System.out.println("메서드 호출1");
	}
}

public class Main2 {

	public static void main(String[] args) {
		// 익명클래스를 이용해서 abc() 오버라이딩 -> B를 생성해서 bcd호출
		A a1 = new A() {

			@Override
			public void abc() {
				new B().bcd();

			}
			
		};
		
		//a.abc();
		A a2 = () -> {
			new B().bcd();
		};
		
	}

}
