package kosa.thread.exam;

public class SmallLetters implements Runnable {

	public void run() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}
	}
}
