package com.vm.tranning.java.collections.List;

import java.util.ArrayList;
import java.util.Scanner;

public class AL2Demo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer>arr= new ArrayList<Integer>();
	arr.add(1);
	arr.add(3);
	arr.add(14);
	arr.add(5);
	arr.add(7);
	arr.add(8);
AL2Operations al2 = new AL2Operations(arr);
System.out.println("ArrayList is "+arr);
	System.out.print("Enter operation:");
	String input = sc.next();
	switch(input)
	{
	case "find":
		System.out.print("Enter eement to find:");
		int k = sc.nextInt();
		
		System.out.println(al2.find(k));
		break;
		
	case "sortao":
		System.out.print("Assending Order ArrayList:"+	al2.sortAo());
		break;
	
	case "sortdo":
		System.out.print("Decending Order ArrayList:"+	al2.sortDo());
		break;
	case "min":
		System.out.print("Min element is: "+al2.min());
		break;
	case "max":
		System.out.print("Max element is: "+al2.max());
		break;
	case "evensum":
		System.out.print("Even elements sum "+al2.evensum());
		break;
	case "oddsum":
		System.out.print("Odd elements sum "+al2.oddsum());
		break;
		
	}
	sc.close();
	
	
}
}