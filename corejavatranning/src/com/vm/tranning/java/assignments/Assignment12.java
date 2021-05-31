package com.vm.tranning.java.assignments;
import java.util.Scanner;
public class Assignment12 {
public static void main(String[] args) {
	 int num,sum=0;
     Scanner sc = new Scanner(System.in);
     int n=sc.nextInt();
     System.out.print("Enter Numbers :");
     while(n-->0)
            {
                    num=sc.nextInt(); 
                    if(num>0)
                    sum +=num;
            }
                    System.out.println( "Sum is : " +sum);
   }
}
