package com.kodewala.Inhiritance2;

import java.util.LinkedList;

public class A1
{
	public static void main(String[] args) {
		LinkedList<Integer> ls = new LinkedList<Integer>();
		ls.add(200);
		ls.add(32);
		ls.add(65);
		ls.add(78);
		ls.add(31);
		
		System.out.println(ls);
		
		ls.remove(2);
		System.out.println(ls);
	}
}
