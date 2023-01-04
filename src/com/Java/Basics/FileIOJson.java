package com.Java.Basics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileIOJson 
{
	/*
	 * METHOD FOR DOING WRITE OPERATION 
	 */
	public static void write() throws IOException
	{
		StreamCity obj = new StreamCity();
		String str = obj.toString();
		String text= String.valueOf(obj);
		StringBuffer buffer = new StringBuffer(" Hai ");
		buffer.append(text);
		Path fileName = Path.of("C:\\Users\\lab\\Desktop\\JAVA\\JAVA Assignments\\"
				+ "ADDRESS BOOK SYSTEM\\Address Book System Program\\src\\com\\Java\\Basics\\message.json");
		Files.writeString(fileName, buffer);
	}
	/*
	 * METHOD FOR DOING READ OPERATION 
	 */
	public static void read() throws IOException
	{
		File file = new File("C:\\Users\\lab\\Desktop\\JAVA\\JAVA Assignments"
				+ "\\ADDRESS BOOK SYSTEM\\Address Book System Program\\src\\com\\Java\\Basics\\message.json");
		BufferedReader br= new BufferedReader(new FileReader(file));
		String st;
		while ((st = br.readLine()) != null)
		{
			System.out.println(st);
		}
	}
	/*
	 * MAIN METHOD OR DRIVER METHOD 
	 */
	public static void main(String[] args) throws IOException
	{
		write();
		read();
	}
}
