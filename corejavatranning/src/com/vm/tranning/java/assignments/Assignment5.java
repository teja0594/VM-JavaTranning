package com.vm.tranning.java.assignments;

import java.util.Scanner;

public class Assignment5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Input Year :");
	int year =sc.nextInt();
	boolean leap = ((year%4==0)||(year%400==0)&&(year%100!=0))?true:false;
	System.out.println(leap?year+" is a leap year":year+" is not a leap year");
}
}
