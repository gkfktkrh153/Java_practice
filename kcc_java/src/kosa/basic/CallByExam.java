package kosa.basic;

public class CallByExam {

	
	public static void change(int num) { // ���� ���� ȣ��
		num += 10;
	}
	public static void change2(int[] numArr) { // ������ ���� ȣ��
		numArr[0] = 10;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abc";
		String str2 = str1; 
		
		str2 = "abcd";
		// String�� �Һ���ü
		// "abcd" �� ���Ǯ�� ���� ������ ���� �� ����
		
		System.out.println(str1);
		System.out.println(str2);
		
	}

}
