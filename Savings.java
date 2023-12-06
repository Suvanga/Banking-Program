import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Savings extends Account// This will extend account 
{
	
	private double annualInterestRate; // this is a private double annual interest rate 
	private String name; //
	

	public Savings(double annualInterest, String name)
	{
		super();
		this.annualInterestRate = annualInterest;
		this.name = name;
	}

	public Savings(long accountNumber, double accountBalance, double annualInterest, String name)
	{
		this.annualInterestRate = annualInterest;
		this.accountBalance = accountBalance;
		this.accountNumber = accountNumber;
		this.name = name;
	}

	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterest)
	{
		this.annualInterestRate = annualInterest;
	}

	public String getName()
	{
		return name;
	}

	@Override
	public void setAccountBalance(double accountBalance)
	{
		this.accountBalance = accountBalance;
	}

	public void makeDeposit(double deposit)
	{
		if (deposit >= 10000)
			accountBalance = accountBalance + deposit + 5;

		else
			accountBalance = accountBalance + deposit;
	}

	public void makeWithdrawal(double withdrawal) throws FileNotFoundException
	{
		
		if ((accountBalance - (withdrawal-1)) >= 0)
		{
			accountBalance = accountBalance - withdrawal;
		}
		else
			
		{	 
			PrintWriter q = new PrintWriter("output.txt");
			System.out.println("overdraft");
			q.println("overdraft");
			q.close();
			System.exit(0);
		}
		
					
	}
	
	
		
	

}
