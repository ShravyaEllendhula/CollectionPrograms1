package com.java.Set_I;

import java.util.*;

public class CommonBetween2Sets 
{
	public static void main(String[] args) 
	{
		Set s1=new HashSet();
		s1.add(10);
		s1.add("shravya");
		s1.add("java");
		s1.add(true);
		s1.add(12.6);
		s1.add('E');
		
		Set s2=new HashSet();
		s2.add("shravya");
		s2.add(10);
		s2.add(12.8);
		s2.add(true);
		
		System.out.println("original s1: "+s1);
		System.out.println("original s2: "+s2);
		s1.retainAll(s2);
		s2.retainAll(s1);
		System.out.println("common betbeen those: "+s1);
		 
	}
}
