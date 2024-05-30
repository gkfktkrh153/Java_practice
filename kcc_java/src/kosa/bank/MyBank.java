package kosa.bank;

public class MyBank {
	private Customer[] customers;
	private int customersNum;
	
	public MyBank() {
		customers = new Customer[10]; 
		customersNum = 0;
	}

	public void addCustomer(String id, String name, long balance) {
		customers[customersNum++] = new Customer(id, name, balance);
	}
	public int getCustomersNum() {
		return customersNum;
	}
	
	  public Customer getCustomer(String id) {
		  for(Customer customer : customers) {
			  if(customer.getId().equals(id))
				  return customer;
		  }
		  return null;
	  };
	 
	
	public Customer[] getAllCustomers() {
		Customer[] returnCustomers = new Customer[customersNum];
		
		for(int i = 0 ; i < customersNum;i++)
		{
			returnCustomers[i] = customers[i];
		}
		
		return returnCustomers;
	}
}
