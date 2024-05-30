package kosa.relation.board;

import java.util.Scanner;

public class Board {
	private Article[] articles;
	private int currentArticlesSize;
    Scanner sc;

	public Board() {
		this.articles = new Article[10];
    	sc = new Scanner(System.in);
	}
	
	public void insertArticle() {
        System.out.print("게시글 제목: ");
		String title = sc.nextLine();
        System.out.print("게시글 내용: ");
		String content = sc.nextLine();
        System.out.print("게시글 작성자: ");
		String author = sc.nextLine();
		
		articles[currentArticlesSize++] = new Article(title, content, author, currentArticlesSize++);
	}
	public void updateArticleTitle() {
        System.out.print("변경할 게시글 번호 입력 : ");
		int number = Integer.parseInt(sc.nextLine());
        System.out.print("변경할 게시글 제목 입력 : ");
		String title = sc.nextLine();

		articles[number].setTitle(title);
	}
	public void updateArticleContent() {
        System.out.print("변경할 게시글 번호 입력 : ");
		int number = Integer.parseInt(sc.nextLine());
        System.out.print("변경할 게시글 내용 입력 : ");
		String content = sc.nextLine();

		articles[number].setTitle(content);

	}
	public void printArticleList() {
		for(Article article : articles) {
			if(article != null)
				System.out.print(article.toString());
		}
	}
	
	
}
