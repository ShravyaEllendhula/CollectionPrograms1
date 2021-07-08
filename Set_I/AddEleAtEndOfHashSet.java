package com.java.Set_I;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class AddEleAtEndOfHashSet 
{
	public static void main(String[] args) 
	{
		Set<Integer> s1=new HashSet();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		Set<Integer> s2=new LinkedHashSet(s1);
		s2.add(100);
		Iterator<Integer> i1=s2.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
