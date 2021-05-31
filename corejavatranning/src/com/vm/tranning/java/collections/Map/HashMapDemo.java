package com.vm.tranning.java.collections.Map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	HashMap<String,String>hm = new HashMap<String, String>();
	HashMapOperations hmo = new HashMapOperations(hm);
	System.out.print("Enter operation:");
	String input = sc.next();
	switch(input)
	{
	case "add":
		System.out.print("Enter name");
		String k = sc.next();
		System.out.println("Enter contact");
		String c=sc.next();
		hmo.add(k, c);
		break;
		
	case "remove":
		System.out.print("Enter name to remove:");
		String name=sc.next();
		hmo.remove(name);
		break;
	
	case "printall":
		hmo.printAll();
		break;
	case "printcontacts":
		hmo.printcontacts();
		break;
	case "printnames":
		hmo.printnames();
		break;

	}
	sc.close();
}
}