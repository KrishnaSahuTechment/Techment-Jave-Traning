package com.techment.oopsAssignments.program1;



class Address
{
	String AddressLine;
	String city;
	
		
	public Address(String addressLine, String city)
	{
		super();
		AddressLine = addressLine;
		this.city = city;
	}

	
	public Address() {
		// TODO Auto-generated constructor stub
	}


	public String getAddressLine()
	{
		return AddressLine;
	}
	public void setAddressLine(String addressLine)
	{
		AddressLine = addressLine;
	}
	
	public String getCity() 
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}






	String	getAddressDetails()
	{
		return AddressLine+", "+city;
	}
	
	
	
}

class Customer
{
	String customerName;
	Address  residentialAddress;
	
	public Customer(String customerName, Address residentialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Address getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	
	void  getCustomerDetails() 
	{	
		System.out.println("Customer Name: " +customerName);
		Address address1=new Address();
		address1.setAddressLine("Ist Main HSR Layout");
		address1.setCity("Bangalore");
		System.out.println("Address :  "+address1.getAddressDetails());
	;
	}
}





public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1 = new Customer();
		customer1.setCustomerName("John");
		customer1.getCustomerDetails();
		
	}

}
