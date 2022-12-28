package com.Java.Basics;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Stream 
{
	/*
	 * Declaration of Required Variables
	 */
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	String zip;
	String mobileNumber;
	String email;
	Object inputs;
	/*
	 * Constructor
	 */
	public Stream() 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}
	/*
	 * Setters & Getters
	 */
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
	public void setCity(String city) 
	{
		this.city = city;
	}
	public void setState(String state) 
	{
		this.state = state;
	}
	public void setZip(String zip) 
	{
		this.zip = zip;
	}
	public void setMobileNumber(String mobileNumber) 
	{
		this.mobileNumber = mobileNumber;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getFirstName() 
	{
		return firstName;
	}
	public String getLastName() 
	{
		return lastName;
	}
	public String getAddress() 
	{
		return address;
	}
	public String getCity() 
	{
		return city;
	}
	public String getState() 
	{
		return state;
	}
	public String getZip() 
	{
		return zip;
	}
	public String getMobileNumber() 
	{
		return mobileNumber;
	}
	public String getEmail() 
	{
		return email;
	}
	/*
	 * Driver Function
	 */
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your Choice : ");
		int choice = scanner.nextInt();
		switch(choice)
		{
		case 1 : ArrayList<String> list1 = new ArrayList<>();
		Stream objx1 = new Stream();
		for(int i=1;i<6;i++)
		{
			System.out.println("Book No : "+i);
			System.out.print("Enter First Name : ");
			objx1.setFirstName(scanner.next());
			list1.add(objx1.getFirstName());
		}
		List<String> Ascend1 = list1.stream().sorted().collect(Collectors.toList());
		System.out.println(Ascend1);
		break;

		case 2 : ArrayList<String> list2 = new ArrayList<>();
		Stream objx2 = new Stream();
		for(int i=1;i<6;i++)
		{
			System.out.println("Book No : "+i);
			System.out.print("Enter Last Name : ");
			objx2.setLastName(scanner.next());
			list2.add(objx2.getLastName());
		}
		List<String> Ascend2 = list2.stream().sorted().collect(Collectors.toList());
		System.out.println(Ascend2);
		break;

		case 3 : ArrayList<String> list3 = new ArrayList<>();
		Stream objx3 = new Stream();
		for(int i=1;i<6;i++)
		{
			System.out.println("Book No : "+i);
			System.out.print("Enter Address : ");
			objx3.setAddress(scanner.next());
			list3.add(objx3.getAddress());
		}
		List<String> Ascend3 = list3.stream().sorted().collect(Collectors.toList());
		System.out.println(Ascend3);
		break;

		case 4 : ArrayList<String> list4 = new ArrayList<>();
		Stream objx4 = new Stream();
		for(int i=1;i<6;i++)
		{
			System.out.println("Book No : "+i);
			System.out.print("Enter City : ");
			objx4.setCity(scanner.next());
			list4.add(objx4.getCity());
		}
		List<String> Ascend4 = list4.stream().sorted().collect(Collectors.toList());
		System.out.println(Ascend4);
		break;

		case 5 : ArrayList<String> list5 = new ArrayList<>();
		Stream objx5 = new Stream();
		for(int i=1;i<6;i++)
		{
			System.out.println("Book No : "+i);
			System.out.print("Enter State Name : ");
			objx5.setState(scanner.next());
			list5.add(objx5.getState());
		}
		List<String> Ascend5 = list5.stream().sorted().collect(Collectors.toList());
		System.out.println(Ascend5);
		break;

		case 6 : ArrayList<String> list6 = new ArrayList<>();
		Stream objx6 = new Stream();
		for(int i=1;i<6;i++)
		{
			System.out.println("Book No : "+i);
			System.out.print("Enter Zip : ");
			objx6.setZip(scanner.next());
			list6.add(objx6.getZip());
		}
		List<String> Ascend6 = list6.stream().sorted().collect(Collectors.toList());
		System.out.println(Ascend6);
		break;

		case 7 : ArrayList<String> list7 = new ArrayList<>();
		Stream objx7 = new Stream();
		for(int i=1;i<6;i++)
		{
			System.out.println("Book No : "+i);
			System.out.print("Enter Mobile Number : ");
			objx7.setMobileNumber(scanner.next());
			list7.add(objx7.getMobileNumber());
		}
		List<String> Ascend7 = list7.stream().sorted().collect(Collectors.toList());
		System.out.println(Ascend7);
		break;


		default : ArrayList<String> list8 = new ArrayList<>();
		Stream objx8 = new Stream();
		for(int i=1;i<6;i++)
		{
			System.out.println("Book No : "+i);
			System.out.print("Enter Email-Id : ");
			objx8.setEmail(scanner.next());
			list8.add(objx8.getEmail());
		}
		List<String> Ascend8 = list8.stream().sorted().collect(Collectors.toList());
		System.out.println(Ascend8);
		}
	}
}

