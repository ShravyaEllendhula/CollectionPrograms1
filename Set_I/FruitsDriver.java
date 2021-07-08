package com.java.Set_I;

import java.util.*;

public class FruitsDriver 
{
	public static void main(String[] args) 
	{
		Set<Fruits> s1=new LinkedHashSet<Fruits>();
		
		Fruits f1=new Fruits();
		Fruits f2=new Fruits();
		
		f1.setFruitName("Mango");
		f1.setQuantity(12);
		f1.setPricePerfruits(10.00);
		f2.setFruitName("banana");
		f2.setQuantity(6);
		f2.setPricePerfruits(2.0);
		s1.add(f1);
		s1.add(f2);
		
		System.out.println("1st iteation");
		Iterator<Fruits> i1=s1.iterator();
		for(Fruits fruits:s1)
		{
			while(i1.hasNext())
			{
				System.out.println(i1.next());
			}
		}
		
		f1.setFruitName("apple");
		s1.add(f1);
		System.out.println("2nd iteation");
		Iterator<Fruits> i2=s1.iterator();
		for(Fruits fruits1:s1)
		{
			while(i2.hasNext())
			{
				System.out.println(i2.next());
			}
		}
		
		
		Set<Fruits> s2=new LinkedHashSet<Fruits>();
		f1.setFruitName("orange");
		s2.add(f1);
		s2.add(f2);
		System.out.println("3rd iteation with new SET");
		Iterator<Fruits> i3=s2.iterator();
		for(Fruits fruits1:s2)
		{
			while(i3.hasNext())
			{
				System.out.println(i3.next());
			}
		}
		
	}
}
