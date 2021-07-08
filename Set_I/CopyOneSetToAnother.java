package com.java.Set_I;

import java.util.*;

public class CopyOneSetToAnother 
{
	public static void main(String[] args) 
	{
		 
		Set<String> familyMem=new LinkedHashSet<>();
		familyMem.add("grandparents");
		familyMem.add("parents");
		familyMem.add("children");
		familyMem.add("grand children");
		
		Set<String> relation=new LinkedHashSet<String>();
		relation.add("grand-mother");
		relation.add("grand-father");		
		relation.add("mother");
		relation.add("father");
		relation.add("son");
		relation.add("daughter");
		relation.add("son-in-law");
		relation.add("daughter-in-law");
		relation.add("etc..");
		
		Set<String> completeFamily =new LinkedHashSet<String>();
		completeFamily.add("****family includes-->>");
		completeFamily.addAll(familyMem);
		completeFamily.add("****like---->>");
		completeFamily.addAll(relation);
		
		Iterator<String> i1=completeFamily.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
		
	}
}
