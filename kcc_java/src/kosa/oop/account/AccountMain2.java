package kosa.oop.account;

public class AccountMain2 {

	public static void main(String[] args) throws Exception {
		
		Account arr[] = {
				new Account("111-111", "홍길동", 10000),
				new CheckingAccount("222-222", "홍길동", 20000, "2222"),
				new MinusAccount("333-333", "홍길동", 30000, 20000)
		};
		
		for(int i =0 ; i < arr.length; i++) {
			if(arr[i] instanceof CheckingAccount)
				((CheckingAccount)arr[i]).pay("111-111", 10000);
		}
		
		
		/*
		 * CheckingAccount checkingAccount = new CheckingAccount("111-111", "홍길동",
		 * 10000, "222-222"); MinusAccount minusAccount = new MinusAccount("111-111",
		 * "승영", 10000, 20000); int withdraw = minusAccount.withdraw(40000);
		 * System.out.println(withdraw);
		 * 
		 * try { checkingAccount.pay("222-222", 3000); } catch (Exception e) {
		 * System.out.println(e.getMessage()); }
		 * 
		 * System.out.println(checkingAccount.getBalance());
		 */
		 
	}	

}
