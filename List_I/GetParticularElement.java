package com.java.List_I;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GetParticularElement
{
	public static void main(String[] args) 
	{
		List<String> al=new ArrayList<>();
		al.add("hai");
		al.add("hello");
		al.add("how r u");
		Iterator<String> i = al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("particular element: "+al.get(2));
	}
}
