package kosa.relation.restaurant;

import kosa.oop.phone.DataInput;

public class Order {
	MenuItem[] menuItems;
	private int totalSalePrice;
	private int menuItemCount;
	
	public Order() {
		menuItems = new MenuItem[10];
		menuItemCount = 0;
		totalSalePrice = 0;
	};
	
	public void addMenu() {
		System.out.print("추가할 메뉴 선택 1.에피타이저 2.메인요리 3.후식 >> ");
		int menu = Integer.parseInt(DataInput.sc.nextLine());
		

		System.out.print("이름 : ");
		String name = DataInput.sc.nextLine();
		System.out.print("비용 : ");
		long price = Long.parseLong(DataInput.sc.nextLine());
		System.out.print("설명 : ");
		String description = DataInput.sc.nextLine();
		
		
		
		switch(menu)
		{
		case 1:
			System.out.print("칼로리 : ");
			long calory = Long.parseLong(DataInput.sc.nextLine());
			menuItems[menuItemCount++] = new Appetizer(name, price, description, calory);
			break;
		case 2:
			System.out.print("당신은 채식주의자 인가요? : ");
			boolean vegetarian = Boolean.parseBoolean(DataInput.sc.nextLine());
			menuItems[menuItemCount++] = new MainCourse(name, price, description, vegetarian);
			break;
		case 3:
			System.out.print("당신은 밀가루를 안먹나요?? : ");
			boolean glutenFree = Boolean.parseBoolean(DataInput.sc.nextLine());
			menuItems[menuItemCount++] = new Dessert(name, price, description, glutenFree);
			break;
		}
//		menuItems[menuItemCount++] = ;
	}
	public void deleteMenu() {
		// 이름 입력 -> 대상 객체 검색 -> 인덱스 찾기 -> 해당 객체 삭제
		int idx = -1;

		System.out.print("삭제할 메뉴를 입력해주세요: ");
		String menuName = DataInput.sc.nextLine();

		for (int i = 0; i < menuItemCount; i++) {
			if (menuItems[i].getName().equals(menuName)) {
				idx = i;
				break;
			}
		}

		for (int i = idx; i < menuItemCount - 1; i++) {
			if (idx == menuItemCount - 1)
				menuItems[idx] = null;
			menuItems[i] = menuItems[i + 1];

		}

		if (idx == -1)
			System.out.println("존재하지 않는 메뉴입니다.");
	}
	public void pay() {
		int idx = -1;

		System.out.print("결제할 메뉴를 입력해주세요: ");
		String menuName = DataInput.sc.nextLine();

		for (int i = 0; i < menuItemCount; i++) {
			if (menuItems[i].getName().equals(menuName)) {
				idx = i;	
				totalSalePrice += menuItems[i].getPrice();
				break;
			}
		}


		if (idx == -1)
			System.out.println("존재하지 않는 메뉴입니다.");
	}

	public void printTotalSalePrice() {
		System.out.println(totalSalePrice);
		
	}
	
	
}
