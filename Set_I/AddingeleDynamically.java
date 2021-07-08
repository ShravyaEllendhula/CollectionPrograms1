package com.java.Set_I;

import java.util.*;
import java.util.Scanner;

public class AddingeleDynamically 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter size");
		int size=scanner.nextInt();
		System.out.println("enter elements");
		Set<String> s1=new HashSet<>(size);
		for(int i=0;i<size;i++) 
		{
			String ele=scanner.next();
			s1.add(ele);
		}
		
		s1.add("lastele");
		Iterator<String> i1 = s1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	} 
}
