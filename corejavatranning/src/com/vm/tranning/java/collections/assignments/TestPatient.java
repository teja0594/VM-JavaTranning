package com.vm.tranning.java.collections.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class TestPatient {
	private static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
	Patient p1 = new Patient();
	p1.setPatientId(1);
	p1.setName("Zoho");
	p1.setAge(40);
	Patient p2 = new Patient();
	p2.setPatientId(2);
	p2.setName("Mahesh");
	p2.setAge(54);
	Patient p3 = new Patient();
	p3.setPatientId(3);
	p3.setName("Aditya");
	p3.setAge(25);
	System.out.println("ArrayList of Patients:");
	List<Patient> patients = new ArrayList<Patient>();
	patients.add(p1);
	patients.add(p2);
	patients.add(p3);
	Collections.sort(patients, new Comparator<Patient>() {
		@Override
		public int compare(Patient o1, Patient o2) {
			return (o1.getName().compareTo(o2.getName()));
		}});
	
	System.out.println("Sort by Name: ");
	for(Patient p : patients)
	{
		System.out.println(p.toString());
	}
	Collections.sort(patients, new Comparator<Patient>() {
		@Override
		public int compare(Patient o1, Patient o2) {
			if(o2.getAge()>o1.getAge())
				return 1;
			else 
				return -1;
		}});
	
	
	System.out.println("Sort by Age: ");
	Iterator<Patient> itr = patients.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next().toString());
	}
	System.out.println("----------------------------------------------");
	
	
	
	System.out.println("TreeSet of Patients:");
	TreeSet<Patient> tpatients = new TreeSet<Patient>(patients);
	
	for(Patient p : tpatients)
	{
		System.out.println(p.toString());
	}
	
	System.out.println();
	System.out.print("Enter Name to get PatientAge: ");
	String pname= sc.next();
	System.out.println("\nThe age of Patient is "+getPatientAge(pname,tpatients)+" years old");
	
	
	

	
	
}
private static int getPatientAge(String name ,TreeSet<Patient> tp)
{
	int tempage = 0;
	for(Patient p :tp)
	{
		if(p.getName().equalsIgnoreCase(name))
			tempage=p.getAge();	
	}
	return tempage;
	
}
}
