package kosa.oop.account;


public class Account {
	private String accountNo;
	private String ownerName;
	private int balance; 
	
	public Account(){}
	
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
			throw new Exception("한도 초과");
		
		balance -= amount;
		return amount;
	}
	public String getAccountNo() {
		return accountNo;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
