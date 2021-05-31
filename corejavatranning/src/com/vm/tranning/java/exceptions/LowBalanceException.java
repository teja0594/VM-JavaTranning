package com.vm.tranning.java.exceptions;

public class LowBalanceException extends Exception {
	  
	private static final long serialVersionUID = 1L;
	String message;
	LowBalanceException(String message)
	{
		this.message=message;
	}
	
	public String toString() {
		return message;
	}
}