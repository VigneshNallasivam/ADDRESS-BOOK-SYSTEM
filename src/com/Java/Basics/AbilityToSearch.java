package com.Java.Basics;

import java.util.ArrayList;
import java.util.Scanner;

public class AbilityToSearch
{
	Scanner scanner = new Scanner(System.in);
    AddNewContactsInAddressBook contact = new AddNewContactsInAddressBook();
	ArrayList<AddNewContactsInAddressBook> contactsArrayList = new ArrayList<AddNewContactsInAddressBook>();
    /*
     * Using Scanners & ArrayList for Editing Existing Contacts
     */
	public void addContact() 
	{
		AddNewContactsInAddressBook contact = new AddNewContactsInAddressBook();
        System.out.println("Enter your FirstName: ");
		contact.setFirstName(scanner.next());
		System.out.println("Enter your LastName: ");
		contact.setLastName(scanner.next());
		System.out.println("Enter your Email: ");
		contact.setEmail(scanner.next());
		System.out.println("Enter your Address: ");
		contact.setAddress(scanner.next());
		System.out.println("Enter your City: ");
		contact.setCity(scanner.next());
		System.out.println("Enter your State: ");
		contact.setState(scanner.next());
		System.out.println("Enter your Zipcode: ");
		contact.setZip(scanner.nextInt());
		System.out.println("Enter your Mobile Number: ");
		contact.setMobile(scanner.nextLong());
        contactsArrayList.add(contact);
	}

	public void showContacts() 
	{
		System.out.println(contact.toString());
		for (int i = 0; i < contactsArrayList.size(); i++) 
		{
			AddNewContactsInAddressBook contacts = contactsArrayList.get(i);
			System.out.println(contacts.toString());
		}

	}

	public void editContact()
	{

		System.out.println("Enter the First Name to Edit : ");
		String FirstName = (scanner.next());
		boolean IsAvaible = false;

		for (AddNewContactsInAddressBook contact : contactsArrayList)
		{
			if (contact.getFirstName().equals(FirstName))
			{
				IsAvaible = true;

				System.out.println("Enter your FirstName: ");
				contact.setFirstName(scanner.next());
				System.out.println("Enter your LastName: ");
				contact.setLastName(scanner.next());
				System.out.println("Enter your Email: ");
				contact.setEmail(scanner.next());
				System.out.println("Enter your Address: ");
				contact.setAddress(scanner.next());
				System.out.println("Enter your City: ");
				contact.setCity(scanner.next());
				System.out.println("Enter your State: ");
				contact.setState(scanner.next());
				System.out.println("Enter your Zipcode: ");
				contact.setZip(scanner.nextInt());
				System.out.println("Enter your Mobile Number: ");
				contact.setMobile(scanner.nextLong());
			}
		}

		if (IsAvaible == false)
		{
			System.out.println("Contact Doesn't exist.");
		}
	}
	/*
	 * Deleting Contact of a Person by Using Persons name
	 */
	
	public void deleteContact()
	{
		System.out.println("Enter the First Name to Delete: ");
		String FirstName = (scanner.next());
		boolean IsAvaible = false;

		for (AddNewContactsInAddressBook contact : contactsArrayList) 
		{
			if (contact.getFirstName().equalsIgnoreCase(FirstName)) 
			{
				IsAvaible = true;
				contactsArrayList.remove(contact);
				System.out.println("!!Deleted!!");
				break;
			}
		}
		if (IsAvaible == false) 
		{
			System.out.println("Doesn't exist.");
		}
	}
	
	public void bookFunctions()
	{
		search();
	}
	
	public void multipleAddressBook()
	{
		for(int i=1;i<=1;i++)
		{
			System.out.println("Enter the New Address Book name");
			String newBook = scanner.next();
			bookFunctions();
		}
	}
	
	public void search()
	{
		System.out.println("Enter the Name to Search : ");
		String FirstName = (scanner.next());
		System.out.println("Enter the City to Search : ");
		String City = (scanner.next());
		boolean IsAvaible = false;

		for (AddNewContactsInAddressBook contact : contactsArrayList) 
		{
			if (contact.getFirstName().equalsIgnoreCase(FirstName)) 
			{
				if(contact.getCity().equalsIgnoreCase(City))
				{
				IsAvaible = true;
				System.out.println("yes! Available");
				break;
				}
			}
		}
		if (IsAvaible == false) 
		{
			System.out.println("Doesn't exist.");
		}
		
	}
	public static void main(String[] args)
	{
		AbilityToSearch obj = new AbilityToSearch();
		obj.addContact();
		obj.showContacts();
		obj.multipleAddressBook();
		
	}
}
