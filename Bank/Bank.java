package javalearning;

import java.util.Scanner;

public abstract class Bank implements Bankaccount {
	
		int CheckBalance,MoneyWithdraw,ReaminingBalance;
	Scanner s=new Scanner(System.in);
	public void CheckBalance()
	{
		System.out.println("total balance is:");
		CheckBalance=s.nextInt();
	}
	public void MoneyWithdraw()
	{
		System.out.println("withdraw:");
		MoneyWithdraw=s.nextInt();
	}
	public void ReaminingBalance()
	{
		CheckBalance=CheckBalance-MoneyWithdraw;
		System.out.println("remaining balance :"+CheckBalance);
	}

}

