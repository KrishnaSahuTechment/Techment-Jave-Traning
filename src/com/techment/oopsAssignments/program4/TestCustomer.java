package com.techment.oopsAssignments.program4;



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
	Address officialAddress;
	
	public Customer(String customerName, Address residentialAddress, Address officialAddress) {
	super();
	this.customerName = customerName;
	this.residentialAddress = residentialAddress;
	this.officialAddress = officialAddress;
}
	
	
	
	public Address getOfficialAddress() {
		return officialAddress;
	}

	
	public void setOfficialAddress(Address officialAddress) {
		this.officialAddress = officialAddress;
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

	
	String  getCustomerDetails() 
	{	
		return ("\nCustomer Name: " +customerName+"\nResidential Address: "+residentialAddress.AddressLine+","+residentialAddress.city+"\nOfficial Address: "+officialAddress.AddressLine+","+officialAddress.city);
	}
}





public class TestCustomer {

	public static void main(String[] args) {
		
		Address residentAddress = new Address("Ist Main HSR Layout","Bangalore");
		Address officeAddress = new Address("Ist Main Electronics city","Bangalore");
		
		Customer customer2 = new Customer("krishna",residentAddress,officeAddress);
		System.out.println(customer2.getCustomerDetails());
		
	}

}
