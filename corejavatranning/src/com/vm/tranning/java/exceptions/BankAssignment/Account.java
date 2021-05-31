package com.vm.tranning.java.exceptions.BankAssignment;
import java.util.ArrayList;
public class Account {
	String accno;
	String ifsc;
	String branch;
	String name;
	String mobile;
	double balance;
	String acctype;
	String userid;
	String password;
	String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	ArrayList<String>transactions = new ArrayList<String>();

	public ArrayList<String> getTransactions() {
		return transactions;
	}
	public void setTransactions(String s) {
		this.transactions.add(s);
	}
	public String getAccno() {
		return accno;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
}
