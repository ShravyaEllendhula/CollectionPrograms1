package com.java.List_I;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GettingCommonEleB_w2Lists 
{
	public static void main(String[] args) 
	{
		List<String> al=new ArrayList<>();
		al.add("hai");
		al.add("hello");
		al.add("how r u");
		 
		List<String> al2=new ArrayList<>();
		al2.add("hai");
		al2.add("hello");
		al2.add("shravya");
		al2.add("how r u");
		
		al.retainAll(al2);
		System.out.println("list 1 elements: "+al);
		System.out.println("list2 elements: "+al2);
		System.out.println("common elements "+al);
		 
	}
}
