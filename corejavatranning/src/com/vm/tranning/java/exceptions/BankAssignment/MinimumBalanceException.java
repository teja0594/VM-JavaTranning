package com.vm.tranning.java.exceptions.BankAssignment;
public class MinimumBalanceException extends Exception{
	private static final long serialVersionUID = 1L;
	String message;
	MinimumBalanceException(String message)
	{
		this.message=message;
	}
	public String toString() {
		return message;
	}
}
