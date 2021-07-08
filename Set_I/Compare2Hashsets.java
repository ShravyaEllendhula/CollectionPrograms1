package com.java.Set_I;

import java.util.HashSet;
import java.util.Set;

public class Compare2Hashsets 
{
	public static void main(String[] args) 
	{
		Set<Character> s1=new HashSet<Character>();
		s1.add('s');
		s1.add('a');
		s1.add('i');
		
		Set<Character> s2=new HashSet<Character>(); 
		s2.add('S');
		s2.add('A');
		s2.add('I');
		
		Set<Character> s3=new HashSet<Character>();
		s3.add('s');
		s3.add('a');
		s3.add('i');
		
		if(s1.equals(s2))
		{
			System.out.println("s1 and s2 are equal");
		}
		else if(s1.equals(s3))
		{
			System.out.println("s1 and s3 sets are equal");
		}
		else if(s2.equals(s3))
		{
			System.out.println("s2 and s3 sets are equal");
		}
		else
		{
			System.out.println("there is no equal sets");
		}
	}
}
