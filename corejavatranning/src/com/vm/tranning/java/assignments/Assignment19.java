package com.vm.tranning.java.assignments;
import java.util.Scanner;
public class Assignment19 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Input: ");
	String s = sc.next();
	int fm=0,sm=0;
	int occr[] = new int[256];
	for(int i=0;i<s.length();i++)
	{
		occr[s.charAt(i)]++;
	}
    for (int i = 0; i <occr.length; i++) {
        if (occr[i]>occr[fm]) {
                sm=fm;
                fm = i;
        }
        else if(occr[i]>occr[sm] && occr[i]!=occr[fm]){
                sm=i;
       }
      }

System.out.print("The second most frequent Character: "+(char)(sm));
	 	
}
}