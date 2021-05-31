package com.vm.tranning.java.strings;

public class RemoveSPaces {
public static void main(String[] args) {
	String s="     Value     Momentum     ";
	String g="";
	 for(int i=0;i<s.length();i++)
	    {
	    	if(s.charAt(i)==' ')
	    		continue;
	    	else
	    		g=g+s.charAt(i);
	    }
	    System.out.println(g);
}
}