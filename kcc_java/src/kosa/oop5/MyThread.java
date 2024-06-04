package kosa.oop5;

public class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i < 10; i++) {
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		Thread thread = new Thread(myThread);
		thread.run();
	}

}
