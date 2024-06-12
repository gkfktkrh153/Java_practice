package kosa.thread.exam;

public class DigitThread extends Thread{

	public void run() {
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread.getName());

	}
}
