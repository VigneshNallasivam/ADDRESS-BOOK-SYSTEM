package com.Java.Basics;
public class CreateContactsInAddressBook 
{
	private String firstName, lastName, email, address, city, state;
	private int zip;
	private long mobile;
	/*
	 * Creating the contact details for address in Constructor
	 */
	public CreateContactsInAddressBook(String firstName, String lastName, String email, String address, String city, String state,
			int zip, long mobile) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.mobile = mobile;
	}

	@Override
	public String toString() 
	{
		return "ContactPerson [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", address="
				+ address + ", city=" + city + ", state=" + state + ", zip=" + zip + ", mobile=" + mobile + "]";
	}
}
