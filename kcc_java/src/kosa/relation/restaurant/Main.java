package kosa.relation.restaurant;

public class Main {

	public static void main(String[] args) {
		System.out.println("레스토랑 주문 시스템");
		Order order = new Order();

		while (true) {
			System.out.print("메뉴를 선택해주세요 : 1.주문 추가 2.주문 삭제 3.결제 4.총 매출  >> ");
			int menu = Integer.parseInt(DataInput.sc.nextLine());
			
			switch (menu) {
			case 1:
				order.addMenu();
				break;
			case 2:
				order.deleteMenu();
				break;
			case 3:
				order.pay();
				break;
			case 4:
				order.printTotalSalePrice();
				break;}
		}
	}

}
