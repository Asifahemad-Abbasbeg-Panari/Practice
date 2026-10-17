package com.kodewala.Inhiritance2;

class InsufficientBalanceException extends RuntimeException{
	public InsufficientBalanceException(String message) {
		super(message);
	}
}

class Account4 {
	
	private int balance=1000;
	
	public void withdraw(int amount) {
		if(amount>balance) {
			throw new InsufficientBalanceException("Insufficiant Balance");
		}
		
		balance -= amount;
		System.out.println("Remaining Balance is: " + balance);
	}
	
	
}

public class Q12
{
	public static void main(String[] args) {
		Account4 acc = new Account4();
		
		try {
			acc.withdraw(1500);
		}
		catch(RuntimeException e) {
				System.out.println(e.getMessage());
		}
	}
}
