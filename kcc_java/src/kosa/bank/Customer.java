package kosa.bank;

public class Customer { //고객의 수는 임의로
	private String id;
	private String name;
	private Account account;
	
	public Customer() {
		
	}

	public Customer(String id, String name, long balance) {		//Account를 생성하기 위한 balance
		this.id = id;
		this.name = name;
		this.account = new Account(id, balance);
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
}
