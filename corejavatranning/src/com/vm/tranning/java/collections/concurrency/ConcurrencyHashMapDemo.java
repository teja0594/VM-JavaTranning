package com.vm.tranning.java.collections.concurrency;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrencyHashMapDemo {
public static void main(String[] args) {
	HashMap<Integer,String> hm = new HashMap<Integer, String>();
	hm.put(1,"Teja");
	hm.put(2,"Surya");
	hm.put(3, "Santosh");
	hm.put(4,"leela");
	for(Map.Entry<Integer,String> i:hm.entrySet())
	{
		System.out.println(i);
		//hm.remove(1);
	}
	//Concurrency-------------------------------------------------------------
	ConcurrentHashMap<Integer,String> chm = new ConcurrentHashMap<Integer, String>();
	chm.putAll(hm);
	for(Map.Entry<Integer,String> i:chm.entrySet())
	{
		System.out.println(i);
		chm.remove(1);
	}
	System.out.println(chm);
	
	
	
}
}
