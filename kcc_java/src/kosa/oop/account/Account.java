package kosa.oop.account;


public class Account {
	String accountNo;
	String ownerName;
	int balance; // ÀÜ¾×
	
	Account(String accountNo, String ownerName, int balance){
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	void deposit(int amount) {
		balance += amount;
	}
	int withdraw(int amount) throws Exception
	{
		if(balance < amount)
			throw new Exception("ÀÜ¾Ø ºÎÁ·");
		
		balance -= amount;
		return amount;
	}
}
