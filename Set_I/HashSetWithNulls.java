package com.java.Set_I;

import java.util.*;
import java.util.Set;


public class HashSetWithNulls 
{
	public static void main(String[] args) 
	{
		Set<Integer> s1=new HashSet();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(null);
		Iterator<Integer> i1=s1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
