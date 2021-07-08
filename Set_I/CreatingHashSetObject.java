package com.java.Set_I;

import java.util.*;

public class CreatingHashSetObject 
{
	public static void main(String[] args) 
	{
		Set s=new  HashSet ();
		s.add(1);
		s.add("shravya");
		s.add('S');
		s.add(18.0);
		Set<Character> s1=new HashSet<Character>();
		s1.add('s');
		s1.add('s');
		s1.add('a');
		s1.add('i');
		
		Set s2=new HashSet();
		s2.addAll(s1);
		s2.addAll(s);
		Iterator i1=s2.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	
		
	}
}
