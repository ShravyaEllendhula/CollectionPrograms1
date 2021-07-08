package com.java.Set_I;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class DiffrentMethodsToMakeSetThreadSafe 
{
	public static void main(String[] args) 
	{
		Set<Integer> s1=new LinkedHashSet();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		//1st way
		System.out.println("using Collections.synchronizedSet ");
	    Set<Integer>s2=Collections.synchronizedSet(s1);
	    Iterator<Integer> i2=s2.iterator();
	    while(i2.hasNext())
	    {
	    	System.out.println(i2.next());
	    }
	    System.out.println("USing CopyOnWriteArraySet:");
	    //2nd way
	    Set<Integer>s3=new CopyOnWriteArraySet<Integer>(s1);
	    Iterator<Integer> i3=s3.iterator();
	    while(i3.hasNext())
	    {
	    	System.out.println(i3.next());
	    	s3.add(100);
	    }
	    System.out.println("USing ConcurrentSkipListSet:");
	    //3rd way
	    Set<Integer> s4=new ConcurrentSkipListSet<Integer>(s1);
	    Iterator<Integer> i4=s4.iterator();
	    while(i4.hasNext())
	    {
	    	System.out.println(i4.next());
	    	s4.add(100);
	    }
	    System.out.println("Using Collections.newSetFromMap(new ConcurrentHashMap())");
	    //4rth-way
		Set<Integer> s5=Collections.newSetFromMap(new ConcurrentHashMap());
		s5.add(10);
		s5.add(100);
		s5.add(1000);
		Iterator i5=s5.iterator();
		while(i5.hasNext())
		{
			System.out.println(i5.next());
			s5.add(20);
		}
	}
	
}
