package com.java.Set_I;

import java.util.*;

public class ConvertHashset_Array 
{
	public static void main(String[] args) 
	{
		Set<Integer> set=new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		System.out.println("set object: "+set);
		Integer[] ints= new Integer[set.size()];
		set.toArray(ints);
		System.out.println("Set--Array: "+Arrays.toString(ints));
		
	}
}
