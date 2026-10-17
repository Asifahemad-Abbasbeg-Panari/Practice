package com.kodewala.Inhiritance2;

public class Q9
{
	public static void main(String[] args) {
		try {
			throw new RuntimeException("Failed");
			//System.out.println("Hello");
		}
		catch(RuntimeException e) {
			System.out.println("Caught");
		}
	}
}
