package com.vm.tranning.java.exceptions.BankAssignment;
import java.text.SimpleDateFormat;
import java.util.Date;
public  class HDFC implements Bank{
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date date = new Date();
	String sDate= sdf.format(date);
	public String Withdrawl(double amount, Account a) throws Exception 
	{
		if(a.status.equalsIgnoreCase("online"))
		{
			if(amount< a.balance)
			{
				a.balance = a.balance-amount;
				System.out.println("Withdrawl of "+amount+"Successful...!");
				return sDate+"\t"+amount+"\t\t\t\t"+a.balance;
			}
			else if(amount>a.balance)
			{
				throw new LowBalanceException("Insufficient Balance....!");
			}
		}
		else
		{
			throw new AccountOnholdException("You can't withdraw Money. Account is onHold. Please vist our Branch");
		}	
		return null;
	}
	public String Deposit(double amount,Account a)throws Exception 
	{
		if(a.status.equalsIgnoreCase("online"))
		{
			a.balance = a.balance+amount;
			System.out.println("Deposit of "+amount+"Successful...!");
			return sDate+"\t\t\t"+amount+"\t\t"+a.balance;
		}
		else
		{
			throw new AccountOnholdException("You can't Deposit Money. Account is onHold. Please vist our Branch");
		}
	}
	public void CheckBalance(Account a) throws Exception
	{
		switch(a.getAcctype())
		{
		case "Savings": if(a.balance<500) throw new MinimumBalanceException("You are not Maintaining MinimumBalance...!");
		else System.out.println("Account Balance: "+a.balance+"/-");
		break;
		case "Current": if(a.balance<10000) 
		{
			String trnx = chargeMessage(a.balance);
			a.setTransactions(trnx);
			System.out.println("Account Balance: "+a.balance+"/-");
			throw new MessageChargesException("Charge of 27/- will be deducted from your account for not maintaining Monthly Balance");
		}	 
		else System.out.println("Account Balance: "+a.balance+"/-");
		break;
		case "Salary":  System.out.println("Account Balance: "+a.balance+"/-(onHold)");break;
		default:break;
		}
	}
	public String chargeMessage(double balance)
	{
		double charge =27.0;
		balance = balance-charge;
		return sDate+"\t"+charge+"\t\t\t\t"+balance;

	}
}
