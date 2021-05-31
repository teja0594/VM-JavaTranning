package com.vm.tranning.java.assignments;

import java.util.Scanner;

public class Assignment26 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	try {
		
		int a;
		System.out.print("Enter Input: ");
		a=sc.nextInt();
		System.out.println(a/0);
	} catch (Exception e) {
	System.out.println("A number cannot be divided by zero");
	}
}
}
