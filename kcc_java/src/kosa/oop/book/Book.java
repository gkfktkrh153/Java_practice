package kosa.oop.book;

public class Book {
	private String name;
	private int price;
	static int totalPrice;

	Book(){};
	
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
		totalPrice +=(this.price - dc(this.price));
	}


	public int dc(int bookPrice) {
		if(bookPrice >= 30000)
			bookPrice *= 0.25;
		else if(bookPrice >= 20000)
			bookPrice *= 0.20;
		else if(bookPrice >= 15000) {
			bookPrice *= 0.15;
		}
		return bookPrice;
		
	}
	
	public void printPrice() {
		System.out.println(this.name + "������ ������ " + this.price 
				+ "�� ���ε� ������ " + (this.price - dc(this.price)) + "�� �Դϴ�.");
	}
}
