package com.kodewala.Inhiritance2;

class Bank{
	public void pay(){
		System.out.println("Bank.pay()");
	}
}

class SBI extends Bank{
	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("SBI.pay()");
	}
	
	public void settalment() {
		System.out.println("SBI.settalment()");
	}
}

class HDFC extends SBI{
	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("HDFC.pay()");
	}
	
	
	public void doKyc() {
		System.out.println("HDFC.doKyc()");
	}
}

public class BankApp
{

	public static void main(String[] args) {
	
		HDFC hdfc = new HDFC();
		hdfc.pay();
		hdfc.doKyc();
		hdfc.settalment();
	}

}
