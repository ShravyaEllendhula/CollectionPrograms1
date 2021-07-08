package com.java.List_I;

import java.util.*;

public class RemoveElements_List 
{
	public static void main(String[] args) 
	{ 
		ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(12);
		al.add(13);
		al.add(10);
		Set<Integer> s1=new LinkedHashSet(al);
		for(Integer temp:s1)
		{
			System.out.println(temp);
		}
		
	}
}
