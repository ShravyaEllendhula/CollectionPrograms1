package com.java.List_I;

import java.util.*;
import java.util.Vector;

public class ConvertLinkedList_Vector 
{
	public static void main(String[] args) 
	{
		LinkedList<String> ll1=new LinkedList();
		ll1.add("hai");
		ll1.add("Hello");
		
		Vector<String> v1=new Vector();
		for(int i=0;i<ll1.size();i++)
		{
			v1.add(ll1.get(i));
		}
		
		System.out.println(v1);
		
		Vector<String> v2=new Vector(ll1);
		System.out.println(v2);
	}
}
