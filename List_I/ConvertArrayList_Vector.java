package com.java.List_I;

import java.util.*;

public class ConvertArrayList_Vector 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al1=new ArrayList();
		al1.add("hai");
		al1.add("Hello");
		//Vector<String> v1=new Vector(al1);
		//System.out.println(v1);
		Vector<String> v1=new Vector();
		for(int i=0;i<al1.size();i++)
		{
			v1.add(al1.get(i));
		}
		
		System.out.println(v1);
	}
}
