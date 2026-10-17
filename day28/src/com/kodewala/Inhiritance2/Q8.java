package com.kodewala.Inhiritance2;

public class Q8
{
	public static int pay() {
		try {
			return 10;
		}
		
		finally {
			return 20;
		}
	}
	
	public static void main(String[] args) {
		int res=pay();
		System.out.println(res);
	}
}
