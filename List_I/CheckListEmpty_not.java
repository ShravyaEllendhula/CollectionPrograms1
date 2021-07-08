package com.java.List_I;

import java.util.LinkedList;

public class CheckListEmpty_not 
{
	public static void main(String[] args) 
	{
		LinkedList<String> ll1=new LinkedList();
		ll1.add("hai");
		ll1.add("hello");
		System.out.println(ll1.isEmpty());
	}
}
