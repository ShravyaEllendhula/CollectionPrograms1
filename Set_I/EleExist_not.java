package com.java.Set_I;

import java.util.HashSet;
import java.util.Set;

public class EleExist_not
{
	public static void main(String[] args)
	{
		Set<Integer> s1=new HashSet<>();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(50);
		System.out.println(s1.contains(30));
		
	}
}
