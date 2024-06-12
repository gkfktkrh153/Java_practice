package kosa.thread.sum;

public class SumMain {

	public static void main(String[] args) {

		SumThread thread1 = new SumThread(1, 50);
		SumThread thread2 = new SumThread(51, 100);

		/*
		 * try { thread1.start(); thread1.join(); thread2.start(); thread2.join();
		 * 
		 * } catch (InterruptedException e) { }
		 */

		thread1.start();
		thread2.start();

		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread.getName());
		System.out.println(thread1.getSum() + thread2.getSum());
	}

}
