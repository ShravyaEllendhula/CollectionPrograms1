package com.java.Set_I;

import java.util.*;

public class FindOutSizeOfTreeSet
{
	public static void main(String[] args) 
	{
		TreeSet<String> ts1=new TreeSet<>();
		ts1.add("A");
		ts1.add("E");
		ts1.add("I");
		ts1.add("O");
		ts1.add("U");
		System.out.println("number of elements present in treeset is: "+ts1.size());
	}
}
