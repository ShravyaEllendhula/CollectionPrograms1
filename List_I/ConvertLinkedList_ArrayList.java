package com.java.List_I;

import java.util.*;

public class ConvertLinkedList_ArrayList 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> ll1=new LinkedList<>();
		ll1.add(10);
		ll1.add(11);
		ArrayList<Integer> al1=new ArrayList<>(ll1);
		System.out.println(al1);
	}
}
