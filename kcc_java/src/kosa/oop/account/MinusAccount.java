package kosa.oop.account;

public class MinusAccount extends Account{
	private int creditLine; // 마이너스 한도
	
	public MinusAccount() {
		
	}

	public MinusAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	int withdraw(int amount) throws Exception
	{
		int balance = getBalance();
		if(balance + creditLine < amount)
			throw new Exception("한도 초과");
		
		setBalance(balance - amount);
		return amount;
	}
	

}
