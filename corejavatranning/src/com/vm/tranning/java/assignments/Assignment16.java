package com.vm.tranning.java.assignments;

import java.util.Scanner;

public class Assignment16 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Input Strng: ");
	String s ="";
	s=s+ sc.nextLine();
	System.out.print("Enter index:");
	int i =sc.nextInt();
	System.out.println("The character at position "+i+" is "+s.charAt(i));
}
}
