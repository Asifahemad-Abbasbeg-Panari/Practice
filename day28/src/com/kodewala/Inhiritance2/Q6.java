package com.kodewala.Inhiritance2;

public class Q6
{
	
	
	public static void main(String[] args) {
		try {
			System.out.println("Enter the Try Block");
			int x = 10/0;
			
		}
		catch(NullPointerException e1) {
			System.out.println("NullPointerException");
		}
		catch (ArithmeticException e2) {
			// TODO: handle exception
			System.out.println("Arithematic Exception");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
