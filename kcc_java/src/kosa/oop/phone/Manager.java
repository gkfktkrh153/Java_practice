package kosa.oop.phone;

import java.util.ArrayList;
import java.util.List;

//전화번호 관리 전반적인 기능
public class Manager {
	private List<PhoneInfo> arr;

	public Manager() {
		arr = new ArrayList<PhoneInfo>();
	}

	public void addPhoneInfo() {
		// 키보드로부터 이름, 전화번호, 생년월일을 입력받아
		// phoneInfo 객체를 생성해서 배열에 추가하는 것
		try {
			System.out.print("1.일반 2.회사 3.동창 ");
			int addMenu = Integer.parseInt(DataInput.sc.nextLine());

			System.out.print("이름: ");
			String name = DataInput.sc.nextLine();
			System.out.print("전화번호: ");
			String phoneNo = DataInput.sc.nextLine();
			System.out.print("생년월일: ");
			String birth = DataInput.sc.nextLine();

			switch (addMenu) {
			case 1:
				arr.add(new PhoneInfo(name, phoneNo, birth));
				break;
			case 2:
				System.out.print("부서: ");
				String dept = DataInput.sc.nextLine();
				System.out.print("직급: ");
				String position = DataInput.sc.nextLine();
				arr.add(new UniversePhoneInfo(name, phoneNo, birth, dept, position));
				break;
			case 3:
				System.out.print("전공: ");
				String major = DataInput.sc.nextLine();
				System.out.print("학번: ");
				String year = DataInput.sc.nextLine();
				arr.add(new CompanyPhoneInfo(name, phoneNo, birth, major, year));
				break;
			}

			System.out.println("전화번호가 등록 되었습니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("허용된 등록 크기는 " + 10 + "명입니다.");
		}

	}

	public void listPhoneInfo() {
		System.out.print("1.일반 2.회사 3.동창 ");
		int listMenu = Integer.parseInt(DataInput.sc.nextLine());
		
		for (int i = 0; i < arr.size(); i++) {
			if(listMenu == 2 && arr.get(i) instanceof CompanyPhoneInfo) {
				arr.get(i).printPhoneInfo();
			}
			else if(listMenu == 3 && arr.get(i) instanceof UniversePhoneInfo) {
				arr.get(i).printPhoneInfo();
			}
			else if(listMenu == 1){
				arr.get(i).printPhoneInfo();
				
			}
		}

	}

	public void searchPhoneInfo() throws Exception {
		// 검색하고자하는 이름으로 1개의 PhoneInfo 객체의 내용을 출력한다.
		System.out.print("검색 이름: ");
		String inputName = DataInput.sc.nextLine();
		for (int i = 0; i < arr.size(); i++) {
			if (inputName.equals(inputName)) {
				arr.get(i).printPhoneInfo();
				return;
			}
		}

		throw new Exception("검색 기록이 없습니다.");
	}

	public void updatePhoneInfo() {
		// 이름을 입력 -> 해당 phoneInfo 추출 -> 수정 전화번호 입력 -> 전화번호 수정이 완료
		System.out.print("변경이 필요한 전화번호를 입력해주세요: ");
		String targetNumber = DataInput.sc.nextLine();

		System.out.print("변경할 전화번호를 입력해주세요: ");
		String updateNumber = DataInput.sc.nextLine();

		int idx = -1;
		for (PhoneInfo phoneInfo : arr) {
			if (phoneInfo.getPhoneNumber().equals(targetNumber)) {
				phoneInfo.updatePhoneNumber(updateNumber);
			}
		}
		if (idx == -1)
			System.out.println("존재하지 않는 전화번호입니다.");

	}

	public void deletePhoneInfo() {
		// 이름 입력 -> 대상 객체 검색 -> 인덱스 찾기 -> 해당 객체 삭제
		int idx = -1;

		System.out.print("삭제할 핸드폰 번호를 입력해주세요: ");
		String phoneNumber = DataInput.sc.nextLine();

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getPhoneNumber().equals(phoneNumber)) {
				PhoneInfo remove = arr.remove(i);
				System.out.println(remove);
				break;
			}
		}


		if (idx == -1)
			System.out.println("존재하지 않는 전화번호입니다.");
	}
}
