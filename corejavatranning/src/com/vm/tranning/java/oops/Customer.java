package com.vm.tranning.java.oops;

public class Customer {

	int id;
	String firstName;
	String lastName;
	String account;
	public Customer()
	{
		this.id=5749;
		this.firstName="Teja";
		this.lastName="Kedari";
		this.account="Savings";
	}
	void show()
	{
		System.out.println(id);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(account);
	}
}