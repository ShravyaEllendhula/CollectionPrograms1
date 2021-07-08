package com.java.List_I;

import java.util.ArrayList;

public class RemoveParticular 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer>  al1=new ArrayList<>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		System.out.println(al1);
		System.out.println("removed elemenet: "+al1.remove(1));
		System.out.println(al1);
	}
}
