package com.kodewala.Inhiritance2;

public class Q1
{
	public static void main(String[] args) {
		System.out.println("Main Methid Started");
		int arr[] = {10, 20, 30};
		
		try {
			System.out.println(arr[5]);
		}
		catch(ArithmeticException e1) {
			System.out.println("Calculation Erro");
			
		}
		
		catch(ArrayIndexOutOfBoundsException s2) {
			System.out.println("Invalid array index");
		}
		
		catch(Exception e3) {
			System.out.println("Unexpected Error");
		}
		
		System.out.println("Main Method Ended");
	}
}
