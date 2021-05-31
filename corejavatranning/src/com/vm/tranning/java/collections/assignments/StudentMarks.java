package com.vm.tranning.java.collections.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentMarks {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Number of Students: ");
	int stucount=sc.nextInt();
	List<Integer> marks = new ArrayList<Integer>();
	List<Integer> markstemp= new ArrayList<Integer>();
	int sum=0;
	double avg=0.0;
	for(int i=1;i<=stucount;i++)
	{
		System.out.println("Enter marks for Student "+i);
		marks.add(sc.nextInt());
	}
	markstemp.addAll(marks);
	Collections.sort(marks,Comparator.reverseOrder());
	System.out.println();
	System.out.println("Highest Marks : "+marks.get(0));
	for(Integer i:marks)
	{
		sum+=i;
	}
	avg=(double)sum/marks.size();
	System.out.println("Average Marks : "+avg);
System.out.println("Marks: "+markstemp);
System.out.println("3rd Student marks :"+markstemp.get(2));
Collections.sort(markstemp);
System.out.print("Sorted: ");
	Iterator<Integer> itr = markstemp.iterator();
	while(itr.hasNext())
	{
		System.out.print(itr.next()+" ");
	}
	
sc.close();
}
}
