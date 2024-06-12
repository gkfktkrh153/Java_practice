package kosa.thread.exam.copy;

public class SmallLetters implements Runnable {

	public void run() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}
	}
}
