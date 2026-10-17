package com.kodewala.Inhiritance2;

import java.util.Scanner;

class InvalidAmountException extends RuntimeException{
	public InvalidAmountException(String message) {
		super(message);
	}
}

class BankAccount {
	public void withdraw(int amount) {
		if(amount<0) {
			throw new InvalidAmountException("Enter Valid Amount");
		}
		
		System.out.println("Withdrawal Request Excepted..");
	}
	
}

public class Q10
{
	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The Amount");
			ba.withdraw(sc.nextInt());
		} 
		catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
}
