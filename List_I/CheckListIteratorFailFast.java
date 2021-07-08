package com.java.List_I;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CheckListIteratorFailFast
{
	public static void main(String[] args) 
	{

//		List<String> al=new ArrayList<>();
//		al.add("hai");
//		al.add("hello");
//		al.add("how r u");
//		Iterator<String> i = al.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//			al.add("is evrything going good");
//		}
//		List<String> al2=new LinkedList<>();
//		al2.add("hai");
//		al2.add("hello");
//		al2.add("how r u");
//		Iterator<String> i1 = al2.iterator();
//		while(i1.hasNext())
//		{
//			System.out.println(i1.next());
//			al.add("is evrything going good");
//		}
//		List<String> al3=new Vector<>();
//		al3.add("hai");
//		al3.add("hello");
//		al3.add("how r u");
//		Iterator<String> i2 = al3.iterator();
//		while(i2.hasNext())
//		{
//			System.out.println(i2.next());
//			al.add("is evrything going good");
//		}
		List<String> l1=new CopyOnWriteArrayList();
		l1.add("hai");
		l1.add("hello");
		l1.add("how r u");
		Iterator<String> i1 = l1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
			l1.add("is evrything going good");
		}
	}
}
