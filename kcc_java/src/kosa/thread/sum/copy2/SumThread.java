package kosa.thread.sum.copy2;

public class SumThread extends Thread{
	private int startNum;
	private int endNum;
	private int sum;
	
	
	
	public SumThread(int startNum, int endNum) {
		super();
		this.startNum = startNum;
		this.endNum = endNum;
	}



	public void run() {
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread.getName());
		for(int i = startNum; i <= endNum; i++) {
			sum += i;
		}
	}



	public int getSum() {
		return sum;
	}

	
	
}
