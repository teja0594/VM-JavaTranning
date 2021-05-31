package com.vm.tranning.java.collections.assignments;

import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ScoreCard {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Map<String ,Integer> players= new TreeMap<String,Integer>();
	System.out.println("ScoreCard");
	while(true)
	{
		String name = sc.next();
		if(name.equals("0"))
			break;
		else
		{
			System.out.print("Enter runs scored by "+name+": ");
		int runs = sc.nextInt();
		players.put(name,runs);
		}
		
	}
	System.out.println("Players who Battled: ");
     players.keySet().forEach(p->System.out.println(p));
     System.out.println("Scores by Players: ");
     players.entrySet().forEach(p->System.out.println(p.getKey()+": "+p.getValue()));
     int totalscore=0;
     for(Integer i:players.values())
     {
    	 totalscore+=i;
     }
     System.out.println("Total Score: "+totalscore);
     int maxruns= Collections.max(players.values());
     for(Map.Entry<String,Integer> i:players.entrySet())
     {
    	 if(i.getValue()==maxruns)
    		 System.out.println("Name of Highest Scorer "+i.getKey()); 
     }
     System.out.println("Runs Scored by Dhoni: "+players.get("dhoni"));
    sc.close();
}
}
