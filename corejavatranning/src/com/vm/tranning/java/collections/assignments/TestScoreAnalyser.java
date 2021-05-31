package com.vm.tranning.java.collections.assignments;

import java.util.LinkedList;
import java.util.Scanner;

public class TestScoreAnalyser {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	LinkedList<Integer> runsdatamain = new LinkedList<Integer>();
	ScoreAnalyser sa = new ScoreAnalyser(runsdatamain);

	while(true)
	{
		
		System.out.println("Enter Runs: ");
		int runs = sc.nextInt();
		if(runs==-1)
			break;
		else
		sa.addRunsToList(runs);
	}
	System.out.println("Runs Scored: "+sa.displayRuns());
	System.out.println("RunRate: "+sa.calcRunRate());
	System.out.println("Lowest Runs: "+sa.lowestRunsScored());
	System.out.println("Count of player who batted: "+sa.runData.size());
	sc.close();
}
}
