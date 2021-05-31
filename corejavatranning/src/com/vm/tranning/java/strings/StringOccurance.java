package com.vm.tranning.java.strings;

import java.util.Scanner;

public class StringOccurance {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s ="Mary and Samantha arrived at the bus station early but waited until noon for the bus";
	String[] s1=s.split(" ");
	int c=0;
	System.out.print("enter the word :");
	String g=sc.next();
	for(int i=0;i<s1.length;i++)
	{
		if(s1[i].equals(g))
			c++;
	}
	System.out.println(c);
}
}