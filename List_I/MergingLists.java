package com.java.List_I;

import java.util.ArrayList;
import java.util.*;

public class MergingLists 
{
	public static void main(String[] args) 
	{
		ArrayList  al1=new ArrayList<>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		ArrayList  al2=new ArrayList<>();
		al2.addAll(al1);
		al2.add('A');
		al2.add('B');
		al2.add('C');
		ArrayList  al3=new ArrayList<>();
		al3.addAll(al2);
		al3.add("Shravya");
		al3.add("Java");
		al3.add("Developer");
		
		Iterator i1=al3.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
