package com.java.List_I;

import java.util.ArrayList;

public class ConvertArrayList_Array 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al1=new ArrayList();
		al1.add("shravya");
		al1.add("hai");
		al1.add("hello");
		String[] s1=al1.toArray(new String[al1.size()]);
		for(String temp:s1)
		{
			System.out.println(temp);
		}
	}
}
