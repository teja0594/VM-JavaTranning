package com.vm.tranning.java.exceptions.BankAssignment;
import java.util.ArrayList;
public class AccountDetails {
	public ArrayList<Account> store()
	{
		Account[] acc = new Account[3];
		for(int i=0;i<3;i++)
		{
			acc[i]=new Account();
		}
		ArrayList<Account> bankaccounts = new ArrayList<Account>();
		acc[0].setAccno("127439474320348");
		acc[0].setIfsc("HDFC03272");
		acc[0].setAcctype("Savings");
		acc[0].setBranch("Noida");
		acc[0].setName("Ravi Kumar");
		acc[0].setMobile("9432754976");
		acc[0].setBalance(450);
		acc[0].setStatus("online");
		acc[0].setUserid("vm12");
		acc[0].setPassword("123456");
		acc[1].setAccno("126392843085343");
		acc[1].setIfsc("HDFC76438");
		acc[1].setAcctype("Current");
		acc[1].setBranch("Delhi");
		acc[1].setName("Keerthana");
		acc[1].setMobile("9520581947");
		acc[1].setBalance(9500);
		acc[1].setStatus("online");
		acc[1].setUserid("vm13");
		acc[1].setPassword("123456");
		acc[2].setAccno("122458930923298");
		acc[2].setIfsc("HDFC04765");
		acc[2].setAcctype("Salary");
		acc[2].setBranch("Mumbai");
		acc[2].setName("Ram chandar");
		acc[2].setMobile("9102938475");
		acc[2].setBalance(100);
		acc[2].setUserid("vm14");
		acc[2].setPassword("123456");
		acc[2].setStatus("onhold");
		for(int i=0;i<3;i++)
		{
			bankaccounts.add(acc[i]);
		}
		return bankaccounts;
	}
}
