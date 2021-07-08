package com.java.Set_I;

import java.util.*;

public class InsertEleAtParticularPosition 
{
	public static void main(String[] args) 
	{
		Set<Integer> s1=new HashSet();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(50);
		s1.add(60);
		s1.add(70);
		s1.add(80);
		System.out.println("original set: "+s1);
		List<Integer> l1=new ArrayList<>(s1);
		l1.add(2, 100);
		Set<Integer> s2=new HashSet(l1);
		System.out.println("Updated set after inserting an element: "+s2);
		
		
	}
}
