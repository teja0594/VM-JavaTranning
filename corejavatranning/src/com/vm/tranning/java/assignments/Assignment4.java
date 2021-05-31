package com.vm.tranning.java.assignments;
import java.util.Scanner;
public class Assignment4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String[] months = new String[]{"January","Febuary","March","April","May","June","July","August","September","October","November","Decmber"};
	String x="135781012";
	System.out.print("Enter month no :");
	int month=sc.nextInt();
	System.out.print("Enter Year :");
	int year = sc.nextInt();
	boolean leap = ((year%4==0)||(year%400==0)&&(year%100!=0))?true:false;
	if(month==2)
	{
		if(leap)
		System.out.println(months[month-1]+" "+year+" has 29 days");
		else
			System.out.println(months[month-1]+" "+year+" has 28 days");	
	}
	else if(x.contains(String.valueOf(month)))
	{
		System.out.println(months[month-1]+" "+year+" has 31 days");
	}
	else
	{
		System.out.println(months[month-1]+" "+year+" has 30 days");
	}
}
}
