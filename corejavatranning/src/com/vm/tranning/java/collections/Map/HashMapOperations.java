package com.vm.tranning.java.collections.Map;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapOperations {

	HashMap<String,String> hm;
	public HashMapOperations(HashMap<String,String> hm)
	{
		this.hm=hm;	}
	public HashMap<String,String> add(String name,String mobile)
	{
		hm.put(name, mobile);
		System.out.println("After ading "+hm);
	return this.hm;
			
	}
	public HashMap<String,String> remove(String name)
	{
		hm.remove(name);
		System.out.println("After removing "+hm);
	return this.hm;		
	}
	public void printnames()
	{
		System.out.println("Nmaes in HashMap: ");
		for(Object o:hm.keySet())
		{
			System.out.println(o);
		}
		
	}
	public void printcontacts()
	{
		System.out.println("Contacts in HashMap: ");
		for(Object o:hm.values())
		{
			System.out.println(o);
		}
		
		
	}
	public void printAll()
	{System.out.println("Nmaes in HashMap: ");
	for(Entry<String, String> hmp:hm.entrySet())
	{
		System.out.println(hmp);
	}
	
		
	}
}