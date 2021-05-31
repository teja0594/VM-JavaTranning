package com.vm.tranning.java.collections.assignments;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ScoreAnalyser {
	LinkedList<Integer> runData;
	

	public ScoreAnalyser(LinkedList<Integer> runData) {
		super();
		this.runData = runData;
	}
    public void addRunsToList(int runs)
    {
    	runData.add(runs);
    }
    public double calcRunRate()
    {
    	double rr=0.00;
    	int totalruns=0;
    	
    	for(Integer i:runData)
    	{
    		totalruns+=i;
    	}
    	rr=(double)totalruns/50;
    	return rr;
    }
    public int lowestRunsScored()
    {
    	Collections.sort(runData);
    	return runData.get(0);
    }
    public List<Integer> displayRuns()
    {
          return runData;
    }
}
