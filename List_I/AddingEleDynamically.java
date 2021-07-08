package com.java.List_I;

import java.util.*;

public class AddingEleDynamically 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size");
		int size=scanner.nextInt();
		ArrayList<Integer> al =new ArrayList(size);
		System.out.println("enter - elements ");
		for(int i=0;i<size;i++)	
		{
			int ele=scanner.nextInt();
			al.add(ele);
		}
		al.add(13);
		System.out.println("Arraylist elements are:");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		al.add(12);
		System.out.println(al);
		
	}
}
