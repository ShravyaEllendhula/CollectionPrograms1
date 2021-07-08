package com.java.List_I;

import java.util.*;

public class ConvertArrayList_LinkedList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al1=new ArrayList();
		al1.add("shravya");
		al1.add("hai");
		al1.add("hello");
		LinkedList<String> ll1=new LinkedList<>(al1);
		System.out.println(ll1);
		
		LinkedList<String> ll2=new LinkedList<>();
		for(int i=0;i<al1.size();i++)
		{
			ll2.add(ll1.get(i));
		}
		System.out.println(ll2);
		
	}
}
