package kosa.oop6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyType myType = new MyType() {

			@Override
			public void hello() {
				System.out.println("111111111111111");
			}
			
		};
		myType.hello();
		
		Runnable run = () -> {
			System.out.println("2222222222");
		};
		
		
		
	}

}
