package javalearning;

public class TestBank extends Bank{
	public static void main(String [] args)
	{
		Bankaccount b1= new TestBank();
		b1.CheckBalance();
		b1.MoneyWithdraw();
		b1.ReaminingBalance();
	}
}


