package com.java.List_I;

import java.util.*;

public class GettingNonCommonele 
{
	public static void main(String[] args) 
	{
		List<Double> l1=new ArrayList();
		l1.add(11.0);
		l1.add(12.0);
		l1.add(13.0);
		l1.add(14.0);
		
		List<Double> l2=new ArrayList();
		l2.add(12.0);
		l2.add(13.0);
		l2.add(15.0);
		l2.add(16.0);
		
		Set s1=new LinkedHashSet(l1);
		s1.removeAll(l2);
		Set s2=new LinkedHashSet(l2);
		s2.removeAll(l1);
		//System.out.println(s1+""+s2);
		Set s3=new LinkedHashSet();
		s3.addAll(s1);
		s3.addAll(s2);
		System.out.println(s3);
		
		
		
	}
}
