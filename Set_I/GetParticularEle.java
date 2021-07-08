package com.java.Set_I;

import java.util.*;

public class GetParticularEle 
{
	public static void main(String[] args) 
	{
		Set<String> set1=new HashSet<>();
		set1.add("Java");
		set1.add("J2ee");
		set1.add("html");
		System.out.println("set: "+set1);
		
		List<String> l1=new ArrayList<>(set1);
		System.out.println(l1.get(1));
		 
		
		
//		 
	}
}
