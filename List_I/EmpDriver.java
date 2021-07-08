package com.java.List_I;

import java.util.*;
 

public class EmpDriver 
{
	public static void main(String[] args) 
	{
		
		List<Employe> l1=new ArrayList();
		Employe e1=new Employe(1, "shravya");
		Employe e2=new Employe(2," sai");
		l1.add(e1);
		l1.add(e2);
		System.out.println(l1);
		
	}
}
