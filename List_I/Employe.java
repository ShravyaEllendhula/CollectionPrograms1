package com.java.List_I;

public class Employe 
{
	int eId;
	String name;
	
	public Employe(int eId, String name) 
	{
		this.eId = eId;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employe [eId=" + eId + ", name=" + name + "]";
	}
	
	
}
