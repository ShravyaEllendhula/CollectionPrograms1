package com.java.Set_I;

import java.util.*;

public class Fruits1Driver
{
	public static void main(String[] args) 
	{
		Set<Fruits1> s1=new LinkedHashSet<Fruits1>();
		
		s1.add(new Fruits1("apple",12,30.0));
		s1.add(new Fruits1("mango",6,15.0));
        for(Fruits1 fruit:s1)
        {
            System.out.println(fruit);
        }
        Fruits1 duplicate = new Fruits1("apple", 12,30.0);
        System.out.println("inserting duplicate object...");
        s1.add(duplicate);
        System.out.println("After insertion:");
        for(Fruits1 fruit:s1)
        {
            System.out.println(fruit);
        }

		
	}
}
