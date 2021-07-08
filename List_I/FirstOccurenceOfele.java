package com.java.List_I;

import java.util.ArrayList;

public class FirstOccurenceOfele 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al1=new ArrayList<>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(10);
		al1.add(40);
		al1.add(30);
		al1.add(10);
		al1.add(20);
		
		int firstOccur=al1.indexOf(30);
		System.out.println(firstOccur);
		
		
	}
}
