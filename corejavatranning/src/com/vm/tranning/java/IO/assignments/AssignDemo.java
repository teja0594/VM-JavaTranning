package com.vm.tranning.java.IO.assignments;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class AssignDemo {
public static void main(String[] args) {
	try {
		String s ="";
		File f = new File("D:/Teja/Desktop/Teja/Teja.txt");
		FileReader fr = new FileReader(f);
		int r = fr.read();
		while(r!= -1)
		{
			s=s+(char)r;
			r=fr.read();
		}
		fr.close();
		StringBuffer sb = new StringBuffer(s);
		String s1 = sb.reverse().toString();
		FileWriter fw = new FileWriter(f);
		fw.write(s1);
		fw.flush();
		fw.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}