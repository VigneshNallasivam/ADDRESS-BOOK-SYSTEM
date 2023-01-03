package com.Java.Basics;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileIO 
{
	public static void write() throws IOException
	{
		
		String str = "Data Is Given Here";
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\lab\\Desktop\\JAVA\\JAVA Assignments\\ADDRESS BOOK SYSTEM\\Address Book System Program\\src\\com\\Java\\Basics\\message.txt"));
		StringBuffer buffer = new StringBuffer(str);
	    buffer.append(writer);
		System.out.println(buffer);
		
	}
	
	public static void read() throws IOException
	{
		File data = new File("C:\\Users\\lab\\Desktop\\JAVA\\JAVA Assignments\\ADDRESS BOOK SYSTEM\\Address Book System Program\\src\\com\\Java\\Basics\\message.txt");
		BufferedReader reader = new BufferedReader(new FileReader(data));
		String str1;
		while((str1 = reader.readLine()) != null)
		{
			System.out.println(str1);
		}
	}
	

	public static void main(String[] args) throws IOException
	{
		
		write();
		read();
	}
}
