package com.java.List_I;

import java.util.ArrayList;

public class ComparingArraylists 
{
	public static void main(String[] args) 
	{
		ArrayList<Character>  al1=new ArrayList<>();
		al1.add('A');
		al1.add('B');
		al1.add('C');
		
		ArrayList<Character>  al2=new ArrayList<>();
		al2.add('A');
		al2.add('B');
		al2.add('C');
		if(al1.equals(al2))
		{
			System.out.println("both list are equal");
		}
		else
		{
			System.out.println("not equal");
		}
		 
	}
}
