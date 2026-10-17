package com.kodewala.Inhiritance2;

public class Q4{

public static  void verifyAge(int age){
	if(age<18) {
		throw new IllegalArgumentException("Age Must Be 18 Or Above");
	}
	
	System.out.println("Rigistration Allowed");
}
	public static void main(String[] args) {
		try {
			verifyAge(20  );
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
