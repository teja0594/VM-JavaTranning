package com.vm.tranning.java.IO.assignments;


import java.io.File;
import java.util.Scanner;

public class Assign2Demo {
public static void main(String[] args) {
	try {
		File f = new File("D:/Teja/Desktop/Teja/numbers.txt");
		if(!f.exists())	
			f.createNewFile();
		String s="";
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine())
		{
			s=s+sc.nextLine();
		}
		String[] str = s.split(",");
		for(int i=0;i<str.length;i++)
		{
			if(Integer.parseInt(str[i])%2==0)
			{
				System.out.print(str[i]+" ");
			}		
		}
		sc.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}