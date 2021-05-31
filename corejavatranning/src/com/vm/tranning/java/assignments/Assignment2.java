package com.vm.tranning.java.assignments;
import java.util.Scanner;
public class Assignment2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st no: ");
		int num1 = sc.nextInt();
		System.out.print("\nEnter 2nd no: ");
        int num2 = sc.nextInt();
		System.out.print("\nEnter 3rd no: ");
		int num3 = sc.nextInt();
		if(num1>num2 && num1>num3)
		{
				System.out.println("\nGreatest no: "+num1);
			}
			else if(num2>num3)
			{
				System.out.println("\nGreatest no: "+num2);
			}
			else
			{
				System.out.println("\nGreatest no: "+num3);
		}
	}

}
