package com.java.List_I;

import java.util.ArrayList;

public class AppendEleAtTheEndList 
{
	public static void main(String[] args) 
	{
		ArrayList  l1=new ArrayList();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(6);
		l1.add(0,2);//append at beginning of list
		l1.add(7);
		System.out.println(l1);
		
	}
}
