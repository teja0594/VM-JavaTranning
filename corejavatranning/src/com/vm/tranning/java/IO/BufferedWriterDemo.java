package com.vm.tranning.java.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterDemo {
public static void main(String[] args) {
	try {
		Scanner sc = new Scanner(System.in);
		File f = new File("D:/Teja/Desktop/Teja/Teja.txt");
		FileWriter fr = new FileWriter(f,true);
		BufferedWriter br = new BufferedWriter(fr);
		if(f.exists())
		{
			
		}
		else
		{
			br.write("ID\t\tName\t\tAge");
		}
		System.out.print("Number of persons: ");
		int n =sc.nextInt();
		while(n-->0)
		{System.out.print("Enter ID:");
			String id = sc.next();
			System.out.print("Enter Name:");
			String name =sc.next();
			System.out.print("Enter Age:");
			String age=sc.next();
			br.newLine();
			br.write(id+"\t\t"+name+"\t\t"+age);
		}
	
		
		br.flush();
		br.close();
		
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}