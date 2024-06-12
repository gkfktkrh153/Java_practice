package kosa.thread.exam.copy;

public class MultithreadExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new DigitThread();
		thread1.start();
		Thread thread7 = new DigitThread();
		thread7.start();
		Thread thread2 = new DigitThread();
		thread2.run();
		Thread thread3 = new DigitThread();
		thread3.run();
		Thread thread4 = new DigitThread();
		thread4.run();
		Thread thread5 = new DigitThread();
		thread5.run();
		Thread thread6 = new DigitThread();
		thread6.run();

//		for(char ch = 'A'; ch <= 'Z'; ch++) {
//			System.out.println(ch);
//		}
	}

}
