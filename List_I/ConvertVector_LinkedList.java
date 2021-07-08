package com.java.List_I;

import java.util.LinkedList;
import java.util.Vector;

public class ConvertVector_LinkedList 
{
	public static void main(String[] args) 
	{
		Vector<String> v1=new Vector();
		v1.add("java");
		v1.add("sql");
		
		LinkedList<String> ll1=new LinkedList();
		for(int i=0;i<v1.size();i++)
		{
			ll1.add(v1.get(i));
		}
		System.out.println(ll1);
		
		LinkedList<String> ll2=new LinkedList(v1);
		System.out.println(ll2);
	}
}
