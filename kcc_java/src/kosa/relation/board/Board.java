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
        System.out.print("�Խñ� ����: ");
		String title = sc.nextLine();
        System.out.print("�Խñ� ����: ");
		String content = sc.nextLine();
        System.out.print("�Խñ� �ۼ���: ");
		String author = sc.nextLine();
		
		articles[currentArticlesSize++] = new Article(title, content, author, currentArticlesSize++);
	}
	public void updateArticleTitle() {
        System.out.print("������ �Խñ� ��ȣ �Է� : ");
		int number = Integer.parseInt(sc.nextLine());
        System.out.print("������ �Խñ� ���� �Է� : ");
		String title = sc.nextLine();

		articles[number].setTitle(title);
	}
	public void updateArticleContent() {
        System.out.print("������ �Խñ� ��ȣ �Է� : ");
		int number = Integer.parseInt(sc.nextLine());
        System.out.print("������ �Խñ� ���� �Է� : ");
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
