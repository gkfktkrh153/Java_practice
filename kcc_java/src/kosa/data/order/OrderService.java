package kosa.data.order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class OrderService {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Order> orderQueue = new LinkedList<Order>();
		int totalPrice = 0;

		while (true) {
			System.out.println("메뉴를 선택해주세요 >");
			System.out.println("1.주문요청 2.주문처리 3.미결제 주문 4.매출액 총액 5.종료");

			int menu = Integer.parseInt(sc.nextLine());
			switch (menu) {

			case 1:
				ArrayList<Food> orderList = new ArrayList<Food>();

				int flag = 0;
				while (true) {
					System.out.println("주문할 메뉴를 선택해주세요 >");
					System.out.println("1.햄버거(8000) 2.제육(9500) 3.돈까스(12000) 4.주문 종료");

					int orderMenu = Integer.parseInt(sc.nextLine());
					switch (orderMenu) {
					case 1:
						orderList.add(new Food("햄버거", 8000));
						break;
					case 2:
						orderList.add(new Food("제육", 9500));
						break;
					case 3:
						orderList.add(new Food("돈까스", 12000));
						break;
					case 4:
						flag = 1;
					}
					if (flag == 1)
						break;
				}
				orderQueue.add(new Order(orderList));
				break;
			case 2:
				Order order = orderQueue.poll();
				for(Food food : order.getFoods())
				{
					totalPrice += food.getPrice();
				}
				break;
			case 3:
				for(Order o: orderQueue) {
					System.out.println(o.toString());
				}
				break;
			case 4:
				System.out.println(totalPrice);
				break;
			case 5:
				return;
			}
		}

	}

}
