package com.java.List_I;

import java.util.ArrayList;
import java.util.Collections;

public class ReversingEle 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList();
		al.add(12);
		al.add(13);
		al.add(11);
		al.add(10);
		System.out.println("Actual List");
		System.out.println(al);
		Collections.reverse(al);
		System.out.println("Reversed-List");
		for(Integer rev: al)
		{
			System.out.println(rev);
		}
		
	}
}
