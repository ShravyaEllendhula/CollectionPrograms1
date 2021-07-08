package com.java.Set_I;

import java.util.*;

public class CheckingEmpty_not 
{
	public static void main(String[] args) 
	{
		Set<Integer> s1=new HashSet<>();
		s1.add(10);
		s1.add(20);
		System.out.println(s1.size());
		System.out.println(s1.isEmpty());
		
	}
}
