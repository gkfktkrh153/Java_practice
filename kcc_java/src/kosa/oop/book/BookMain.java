package kosa.oop.book;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] bookArr = {new Book("JAVA", 30000), new Book("JSP", 20000), new Book("ORACLE", 15000)};
		for(Book book : bookArr) {
			book.printPrice();
		}
		System.out.println("รั ฑÝพื : "  + Book.totalPrice);
	}

}
