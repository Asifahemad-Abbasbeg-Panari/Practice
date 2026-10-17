package com.kodewala.Inhiritance2;

class Account {
	public void openAccount(String userId) {
		
	}
}
  
class SavingAccount extends Account {
	@Override
	public void openAccount(String userId) {
		System.out.println("SavingAccount.openAccount()");
	}
}

class SrCitizenAccount extends SavingAccount{
	@Override
	public void openAccount(String userId) {
		// TODO Auto-generated method stub
		System.out.println("SrCitizenAccount.openAccount()");
	}
}


class PensionAccount extends SrCitizenAccount{
	@Override
	public void openAccount(String userId) {
		// TODO Auto-generated method stub
		System.out.println("PensionAccount.openAccount()");
	}
}

public class AccountApp
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PensionAccount pa = new PensionAccount();
		pa.openAccount("SBI00405300");
		
	}

}
