package com.vm.tranning.java.exceptions.BankAssignment;
import java.util.ArrayList;
import java.util.Scanner;
public class HDFCBankInterface {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception{
		System.out.println("Welcome to HDFC Banking.......!");
		AccountDetails ad = new AccountDetails();
		ArrayList<Account>accounts= ad.store();
		System.out.print("Enter UserID: ");
		String uid = sc.next();
		System.out.print("Enter Passowrd: ");
		String pass = sc.next();
		for(Account account:accounts)
		{
			if(account.userid.equalsIgnoreCase(uid)&&account.password.equals(pass))
			{
				System.out.println("Welcome "+account.getName());
				BankInterface(account);
			}
		}
	}
	private static void BankInterface(Account a) throws Exception
	{
		HDFC hdfc = new HDFC();
		boolean repeat = true;
		while(repeat){
			int choice = printMenu();
			switch(choice){
			case 1:
				System.out.print("Enter amount to Withdraw: ");
				double amount = sc.nextDouble();
				String trnx= hdfc.Withdrawl(amount, a);
				a.setTransactions(trnx);
				break;
			case 2: 
				System.out.print("Enter amount to Deposit: ");
				double amount1 = sc.nextDouble();
				String trnx2= hdfc.Deposit(amount1, a);
				a.setTransactions(trnx2);
				break;
			case 3: 
				hdfc.CheckBalance(a);
				break;
			case 4: 
				System.out.println("----Account Transactions--------------");
				System.out.println("   Date \tWithdraw\tDeposit\t\tBalance");
				ArrayList<String> tranxs = a.getTransactions();
				for( String transaction:tranxs)
				{
					System.out.println(transaction);
				}
				break;
			case 0:
				System.out.println("Thanks for Visiting our Banking App...!");
				repeat = false;
				break;
			default:repeat = false;
			break;
			}
		}
	}
	private static int printMenu(){
		System.out.println("------------------------------------------");
		System.out.println("1. Withdrawl");
		System.out.println("2. Deposit");
		System.out.println("3. CheckBalance");
		System.out.println("4. Account Transactions");
		System.out.println("0. Logout");
		System.out.println("------------------------------------------");
		return sc.nextInt();
	}
}
