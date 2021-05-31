package com.vm.tranning.java.assignments;
import java.util.Scanner;
public class Assignment8 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Input Number :");
	int n = sc.nextInt();
	for(int i=0;i<n;i++)
	{
		System.out.println("Number is : "+(i+1)+" and cube of "+(i+1)+" is : "+((i+1)*(i+1)*(i+1)));
	}
}
}
