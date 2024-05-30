package kosa.oop.account;

public class AccountMain {

	public static void main(String[] args) {

		Account account = new Account("1", "ㅁㅁㅁ", 1000); // 메모리를 할당받고 참조값 저장

		account.deposit(500);
		try {
			account.withdraw(2500);
		} catch (Exception e) {
		}

		System.out.println("계좌번호 : " + account.accountNo);
		System.out.println("계좌주 : " + account.ownerName);
		System.out.println("잔액" + account.balance);

	}

}
