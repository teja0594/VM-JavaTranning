package com.vm.tranning.java.assignments;
import java.util.Scanner;
public class Assignment11 {
	static int feb(int num)
	{
		if(num==0)
			return 0;
		if(num==1||num==2)
			return 1;
		return feb(num-1)+feb(num-2);
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Number : ");
	int n = sc.nextInt();
	for(int i=0;i<n;i++)
		System.out.print(feb(i)+" ");
	}
}
