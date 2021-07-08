package com.java.List_I;

import java.util.ArrayList;

public class RetriveElePariculatPosition 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(10);
		System.out.println(al1.get(3));
	}
}
