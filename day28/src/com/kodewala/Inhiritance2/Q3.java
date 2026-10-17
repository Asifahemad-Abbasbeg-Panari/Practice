package com.kodewala.Inhiritance2;

public class Q3
{
	public static void main(String[] args) {
		try {
			System.out.println("Try Method Started");
			System.out.println(10/0);
		}
		catch(Exception e) {
			System.out.println("Exception Handaled");
		}
		
		finally {
			System.out.println("Clean up Code..");
		}
	}
}
