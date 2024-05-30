package kosa.bank;

public class Account {
	private String id;
	private long balance;
	
	public Account() {
		
	}
	
	public Account(String id, long balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public void deposit(long amount) {
		balance += amount;
	}
	public boolean withdraw(long amount) {
		if(balance - amount > 0)
		{
			balance -= amount;
			return true;
		}
		return false;
	}
	public String getId() {
		return id;
	}
	public long getBalance() {
		return balance;
	}
}
