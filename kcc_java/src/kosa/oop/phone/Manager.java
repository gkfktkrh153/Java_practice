package kosa.oop.phone;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import kosa.io.exam.Member;
import kosa.io.exam.Video;

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
			if (listMenu == 2 && arr.get(i) instanceof CompanyPhoneInfo) {
				arr.get(i).printPhoneInfo();
			} else if (listMenu == 3 && arr.get(i) instanceof UniversePhoneInfo) {
				arr.get(i).printPhoneInfo();
			} else if (listMenu == 1) {
				arr.get(i).printPhoneInfo();

			}
		}

	}

	public void searchPhoneInfo() throws Exception {
		// 검색하고자하는 이름으로 1개의 PhoneInfo 객체의 내용을 출력한다.
		System.out.print("검색 이름: ");
		String inputName = DataInput.sc.nextLine();

		PhoneInfo phoneInfo = arr.stream()
				.filter(p -> p.getName().equals(inputName))
				.findFirst().orElseThrow(() -> new Exception("검색 기록이 없습니다."));

		
		phoneInfo.printPhoneInfo();

		/**
		 * 반복문으로 구현 for (int i = 0; i < arr.size(); i++) { if
		 * (inputName.equals(inputName)) { arr.get(i).printPhoneInfo(); return; } }
		 **/
		;
	}

	public void updatePhoneInfo() {
		// 이름을 입력 -> 해당 phoneInfo 추출 -> 수정 전화번호 입력 -> 전화번호 수정이 완료
		System.out.print("변경이 필요한 전화번호를 입력해주세요: ");
		String targetNumber = DataInput.sc.nextLine();

		System.out.print("변경할 전화번호를 입력해주세요: ");
		String updateNumber = DataInput.sc.nextLine();

		Optional<PhoneInfo> findFirst = arr.stream()
				.filter(p -> p.getPhoneNumber().equals(targetNumber))
				.findFirst();

		
		
		if (!findFirst.isEmpty()) {
			findFirst.get().updatePhoneNumber(updateNumber);
			return;
		}

		System.out.println("존재하지 않는 전화번호입니다.");

		/*
		 * int idx = -1; for (PhoneInfo phoneInfo : arr) { if
		 * (phoneInfo.getPhoneNumber().equals(targetNumber)) {
		 * phoneInfo.updatePhoneNumber(updateNumber); } }
		 */
	}

	public void deletePhoneInfo() {
		// 이름 입력 -> 대상 객체 검색 -> 인덱스 찾기 -> 해당 객체 삭제

		System.out.print("삭제할 핸드폰 번호를 입력해주세요: ");
		String phoneNumber = DataInput.sc.nextLine();

		Optional<PhoneInfo> findFirst = arr.stream()
				.filter(p -> p.getPhoneNumber().equals(phoneNumber))
				.findFirst();

		if (!findFirst.isEmpty()) {
			arr.remove(findFirst.get());
			return;
		}
		System.out.println("존재하지 않는 전화번호입니다.");

		/*
		 * 반복문으로 int idx = -1;
		 * 
		 * for (int i = 0; i < arr.size(); i++) { if
		 * (arr.get(i).getPhoneNumber().equals(phoneNumber)) { arr.remove(i); idx = i;
		 * break; } }
		 * 
		 * if (idx == -1) System.out.println("존재하지 않는 전화번호입니다.");
		 */
	}

	public void sortPhoneInfo() {
		System.out.print("1.이름 순(오름차순) 2.이름 순(내림차순) 3.번호 순(오름차순) 4.번호 순(내림차순) 5.생년월일(오름차순) 6.생년월일(내림차순)");
		int sortMenu = Integer.parseInt(DataInput.sc.nextLine());

		switch (sortMenu) {
		case 1:
			sortByNameAsc();
			break;
		case 2:
			sortByNameDesc();
			break;
		case 3:
			sortByPhoneNumberAsc();
			break;
		case 4:
			sortByPhoneNumberDesc();
			break;
		case 5:
			sortByBirthDayAsc();
			break;
		case 6:
			sortByBirthDayDesc();
			break;
		}
	}

	private void sortByBirthDayAsc() {
		Collections.sort(arr, new Comparator<>() {
			@Override
			public int compare(PhoneInfo o1, PhoneInfo o2) {
				if (o1.getBirth().compareTo(o2.getBirth()) < 0) {
					return 1;
				} else if (o1.getBirth().compareTo(o2.getBirth()) > 0)
					return -1;
				return 0;
			}

		});
	}

	private void sortByBirthDayDesc() {
		Collections.sort(arr, new Comparator<>() {
			@Override
			public int compare(PhoneInfo o1, PhoneInfo o2) {
				if (o1.getBirth().compareTo(o2.getBirth()) < 0) {
					return -1;
				} else if (o1.getBirth().compareTo(o2.getBirth()) > 0)
					return 1;
				return 0;
			}

		});
	}

	private void sortByPhoneNumberAsc() {
		Collections.sort(arr, new Comparator<>() {
			@Override
			public int compare(PhoneInfo o1, PhoneInfo o2) {
				if (o1.getPhoneNumber().compareTo(o2.getPhoneNumber()) < 0) {
					return -1;
				} else if (o1.getPhoneNumber().compareTo(o2.getPhoneNumber()) > 0)
					return 1;
				return 0;
			}

		});
	}

	private void sortByPhoneNumberDesc() {
		Collections.sort(arr, new Comparator<>() {
			@Override
			public int compare(PhoneInfo o1, PhoneInfo o2) {
				if (o1.getPhoneNumber().compareTo(o2.getPhoneNumber()) < 0) {
					return 1;
				} else if (o1.getPhoneNumber().compareTo(o2.getPhoneNumber()) > 0)
					return -1;
				return 0;
			}

		});
	}

	private void sortByNameDesc() {
		Collections.sort(arr, new Comparator<>() {
			@Override
			public int compare(PhoneInfo o1, PhoneInfo o2) {
				if (o1.getName().compareTo(o2.getName()) < 0) {
					return 1;
				} else if (o1.getName().compareTo(o2.getName()) > 0)
					return -1;
				return 0;
			}

		});
	}

	private void sortByNameAsc() {
		Collections.sort(arr, new Comparator<>() {
			@Override
			public int compare(PhoneInfo o1, PhoneInfo o2) {
				if (o1.getName().compareTo(o2.getName()) < 0) {
					return -1;
				} else if (o1.getName().compareTo(o2.getName()) > 0)
					return 1;
				return 0;
			}

		});
	}

	public void writePhoneInfo() {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("phoneInfo.ser"));

			oos.writeObject(arr);
		}catch(Exception ex){
			ex.printStackTrace();
		}finally {
			try {
				oos.close();
			}catch (Exception e) {}
		}
		
	}

	public void readPhoneInfo() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("phoneInfo.ser"));
			arr  = (List<PhoneInfo>) ois.readObject();
			for(PhoneInfo  p : arr) {
				p.printPhoneInfo();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			}catch(Exception e2){}
		}
		
	}
}
