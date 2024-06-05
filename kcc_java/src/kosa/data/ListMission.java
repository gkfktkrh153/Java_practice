package kosa.data;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListMission {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		List<String> list = new LinkedList<String>();

		int menu = 0;
		while (menu != 4) {
			System.out.print("1.데이터 추가 2.데이터 삭제 3.데이터 출력 4.종료  >> ");
			menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1:
				System.out.print("입력 데이터 : ");
				String data = sc.nextLine();
				list.add(data);
				break;
			case 2:
				System.out.print("삭제할 데이터 : ");
				String deleteData = sc.nextLine();
				list.remove(deleteData);
				break;
			case 3:
				/*
				 * for(String str : list) System.out.println(str);
				 */
				Iterator<String> iter = list.iterator();
				while(iter.hasNext())
					System.out.println(iter.next());
				break;
			}
		}
	}

}
