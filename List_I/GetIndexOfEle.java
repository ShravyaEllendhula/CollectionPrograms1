package com.java.List_I;

import java.util.*;

public class GetIndexOfEle 
{
	public static void main(String[] args) 
	{
		ArrayList<String> ll1=new ArrayList();
		ll1.add("java");
		ll1.add("j2ee");
		ll1.add("java");
		ll1.add("html");
		System.out.println(ll1.indexOf("j2ee"));
	}
}
