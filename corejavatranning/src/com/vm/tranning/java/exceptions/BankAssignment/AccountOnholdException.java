package com.vm.tranning.java.exceptions.BankAssignment;
public class AccountOnholdException extends Exception{
	private static final long serialVersionUID = 1L;
	String message;
	AccountOnholdException(String message)
	{
		this.message=message;
	}
	public String toString() {
		return message;
	}
}
