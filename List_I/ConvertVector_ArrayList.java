package com.java.List_I;

import java.util.*;
import java.util.Vector;

public class ConvertVector_ArrayList 
{
	public static void main(String[] args) 
	{
		Vector<String> v1=new Vector<>();
		v1.add("shravya");
		v1.add("java");
		v1.add("developer");
		//1st way
		ArrayList al=new ArrayList(v1);
		System.out.println(al);
		//2nd way
		ArrayList a2=new ArrayList();
		for(int i=0;i<v1.size();i++)
		{
			a2.add(v1.get(i));
		}
		System.out.println(a2);
		
		
		
	}
}
