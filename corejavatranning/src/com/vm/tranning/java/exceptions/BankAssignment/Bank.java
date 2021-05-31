package com.vm.tranning.java.exceptions.BankAssignment;
public interface Bank {
	public String Withdrawl(double amount,Account a) throws Exception;
	public String Deposit(double amount,Account a)throws Exception;
	public void CheckBalance(Account a)throws Exception;
}
