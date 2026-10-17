package com.kodewala.Inhiritance2;

import java.io.FileNotFoundException;

public class Q5
{
	public static void fileRead() throws FileNotFoundException {
		throw new FileNotFoundException("Unable to use data");
	}
	
	public static void main(String[] args) {
		try {
			fileRead();
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
