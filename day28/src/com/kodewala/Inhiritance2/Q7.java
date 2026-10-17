package com.kodewala.Inhiritance2;

public class Q7
{
	public static void m3() {
		int x = 10/0;
	}
	
	public static void m2() {
		m3();
	}
	
	public static void m1() {
		m2();
	}
	
	
	public static void main(String[] args) {
		try {
			m1();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
