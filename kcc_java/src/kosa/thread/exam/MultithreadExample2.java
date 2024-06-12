package kosa.thread.exam;

public class MultithreadExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new Thread(new SmallLetters());
		thread1.start();

		char[] arr = { 'ㄱ', 'ㄴ', 'ㄷ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅅ', 'ㅇ', 'ㅈ', 'ㅊ', 'ㅋ', 'ㅍ', 'ㅌ', 'ㅎ' };
		for(char ch : arr)
			System.out.println(ch);

	}

}
