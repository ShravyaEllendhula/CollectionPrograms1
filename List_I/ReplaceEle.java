package com.java.List_I;

import java.util.ArrayList;

public class ReplaceEle 
{
	public static void main(String[] args) 
	{
		ArrayList<Character>  al2=new ArrayList<>();
		al2.add('A');
		al2.add('B');
		al2.add('C');
		System.out.println("before replace: "+al2);
		al2.set(2, 'D');
		System.out.println("after replcing: "+al2);
	}
}
