package com.java.Set_I;

import java.util.*;

public class ConvertArray_Hashset 
{
	public static void main(String[] args) 
	{
		
		String[] str= {"hai","hello","how r u"};
		Set<String> set=new HashSet<>(Arrays.asList(str));
		for(String temp:set)
		{
			System.out.println(temp);
		}
		
//		String[] str1= {"hai","hello","how r u"};
//		Set<String> set1=new HashSet<>();
//		System.out.println(Collections.addAll(set1, str1));
	}
}
