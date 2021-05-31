package com.vm.tranning.java.assignments;
import java.util.Scanner;
public class Assignment1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input:");
		int n = sc.nextInt();
		if(n<0)
		{
			System.out.println("Negative Number");
			
		}
		else if(n>0)
		{
			System.out.println("Positive Number");
		}
		else
		{
			System.out.println("Zero");
		}
	}
	

}
