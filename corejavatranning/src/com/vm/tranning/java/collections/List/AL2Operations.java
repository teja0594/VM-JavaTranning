package com.vm.tranning.java.collections.List;

import java.util.ArrayList;
import java.util.Collections;

public class AL2Operations {
	ArrayList<Integer> a;
	public AL2Operations(ArrayList<Integer> a)
	{
		this.a=a;
		Collections.sort(a);
	}

	public String find(int k)
	{
		if(a.contains(k))
			return "found";
		else
			return "not found";
			
		
	}
	public ArrayList<Integer> sortAo()
	{
	    return a;
		
	}
public ArrayList<Integer> sortDo()
	{ 
	Collections.reverse(a);
	return a;
		
	}
	public Integer min()
	{
		return a.get(0);
		
		
}
	public Integer max()
	{
		return a.get(a.size()-1);
		
	}
	public int evensum()
	{
		int evencount=0;
		for(Integer i:a)
		{
			if(i%2==0)
				evencount=evencount+i;
				
		}
		return evencount;
		
	}
	public int oddsum()
	{
		int oddcount=0;
		for(Integer i:a)
		{
			if(i%2!=0)
				oddcount=oddcount+i;
				
		}
		return oddcount;
		
	}
}