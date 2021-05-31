package com.vm.tranning.java.assignments;
import java.util.Scanner;
public class Assignment7 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sum=0;
	double avg=0.0;
	System.out.println("Enter Numbers:");
	int[] a=new int[5];
	for(int i=0;i<5;i++)
	{
		a[i]=sc.nextInt();
		sum=sum+a[i];
	}
	avg=sum/a.length;
	System.out.println("Sum is "+sum);
	System.out.println("Average is "+avg);
}
}
