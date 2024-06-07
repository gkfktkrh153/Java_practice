package kosa.data;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackQueueExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("1");
		queue.offer("2");
		queue.offer("3");
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		/*
		 * // 올바른 괄호 예제(Stack)
		 * 
		 * System.out.print("수식 입력 : "); String strs = sc.nextLine(); Stack<String>
		 * stack = new Stack<String>();
		 * 
		 * 
		 * for(String str : strs.split("")) { if(str.equals("(")) stack.add(str); else
		 * if(str.equals(")")) { if(!stack.empty()) stack.pop(); else {
		 * System.out.println("불일치"); return; } }
		 * 
		 * } if(stack.empty()) System.out.println("올바른 괄호"); else
		 * System.out.println("불일치");
		 */
		
	}

}
