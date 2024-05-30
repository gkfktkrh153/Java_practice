package kosa.oop.board;

public class Article {
	private String title;
	private String content;
	private String author;
	private int number;
	
	public Article() {}
	
	public Article(String title, String content, String author, int number) {
		this.title = title;
		this.content = content;
		this.author = author;
		this.number = number;
	}


	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public String toString() {
		return number + ". " + title + "\n" +
				"�ۼ��� : " + author + "\n" +
				"�Խñ� ���� : " + content + "\n";  
	}
}
