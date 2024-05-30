package kosa.oop.board;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Board board = new Board();
		
		
		while (true) {
			System.out.println("1.게시글 추가 2.게시글 목록 출력 3.게시글 제목 변경 4.게시글 내용 변경 5.종료 > ");
			System.out.print("메뉴: ");
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
				System.out.println("프로그램 종료");
				return;
			}
		}
	}

}
