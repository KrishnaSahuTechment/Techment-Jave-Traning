package com.techment.day5.oops;

class Account
{
	
	long accountNo;
	String accountType;
	long balence;
	String ifsc;
	String branch;
	public Account(long accountNo, String accountType, long balence, String ifsc, String branch) {
	super();
	this.accountNo = accountNo;
	this.accountType = accountType;
	this.balence = balence;
	this.ifsc = ifsc;
	this.branch = branch;
}


}







public class Customer extends Account
{

	private static long accountNo;
	int customerId;
	String customerName;
	Account account;
	
	public Customer(int customerId, String customerName, Account account) {
		super(accountNo, customerName, accountNo, customerName, customerName);
		this.customerId = customerId;
		this.customerName = customerName;
		this.account = account;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account = new Account(1245,"savings", 5000, "SBI00KUM", "kumhari");
		Customer customer =new Customer(1,"Krishna sahu", account);
		
		System.out.println("id = "+customer.customerId);
		System.out.println("Name = "+customer.customerName);
		System.out.println("Account number = "+customer.account.accountNo);
		System.out.println("Account type = "+customer.account.accountType);
		System.out.println("Account balence = "+customer.account.balence);
		System.out.println("Branch = "+customer.account.branch);
		System.out.println("IFSC code= "+customer.account.ifsc);

		
	}

}
