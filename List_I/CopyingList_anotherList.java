package com.java.List_I;

import java.util.*;

public class CopyingList_anotherList 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		
		ArrayList<Integer> l2=(ArrayList<Integer>)( l1.clone());
//		ArrayList<Integer> l2=new ArrayList();
//      sl2.addAll(l1);
        l2.add(40);
        l2.add(50);
        l2.add(60);
        System.out.println(l2);
		
	}
}
