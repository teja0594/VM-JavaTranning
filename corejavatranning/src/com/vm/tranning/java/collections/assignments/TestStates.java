package com.vm.tranning.java.collections.assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestStates {
public static void main(String[] args) throws Exception {
	File f = new File("D:/Teja/Desktop/Teja/states.txt");
	FileReader fr = new FileReader(f);
	BufferedReader br = new BufferedReader(fr);
	Set<String> states = new LinkedHashSet<String>();
	String line = br.readLine();
	while(line!=null)
	{
		states.add(line);
		line=br.readLine();
	}
	System.out.println("Total no of States: "+states.size());
	System.out.println(states);
	states.remove("Delhi");
	System.out.println("States after removing Delhi: ");
	System.out.println(states);
	System.out.println("States starting with K: ");
	for(String i:states) {
		if(i.startsWith("K"))
			System.out.print(i+" ");
	}
	SortedSet<String> sortedStaes = new TreeSet<String>(states); 
	System.out.println("\nStates after Sorting: ");
	System.out.println(sortedStaes);
	br.close();
}
}
