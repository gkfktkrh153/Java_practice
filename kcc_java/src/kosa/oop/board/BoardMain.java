package kosa.oop.board;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Board board = new Board();
		
		
		while (true) {
			System.out.println("1.�Խñ� �߰� 2.�Խñ� ��� ��� 3.�Խñ� ���� ���� 4.�Խñ� ���� ���� 5.���� > ");
			System.out.print("�޴�: ");
			int input = Integer.parseInt(sc.nextLine());
			switch (input) {
			case 1:
				try {
					board.insertArticle();
				} catch (Exception ex) {
					 System.out.println(ex.getMessage()); 
					ex.printStackTrace();
				}
				break;
			case 2:
				board.printArticleList();
				break;
			case 3:
				board.updateArticleTitle();
				break;
			case 4:
				board.updateArticleContent();
			case 5:
				System.out.println("���α׷� ����");
				return;
			}
		}
	}

}
