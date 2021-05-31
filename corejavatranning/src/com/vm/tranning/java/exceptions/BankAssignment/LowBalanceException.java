package com.vm.tranning.java.exceptions.BankAssignment;
public class LowBalanceException extends Exception{
	private static final long serialVersionUID = 1L;
	String message;
	public LowBalanceException(String message)
	{
		this.message=message;
	}
	public String toString() {
		return message;
	}
}
