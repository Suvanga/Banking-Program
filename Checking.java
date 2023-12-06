import java.io.FileNotFoundException;
import java.io.PrintWriter;
// this is a  checking class 
public class Checking extends Account
{
	private double annualInterestRate;
	private String name;
//The first constructor will take annual interest rate and string name as argument and store them respectively  
	public Checking(double annualInterestRate, String name)
	{
		super();
		this.annualInterestRate = annualInterestRate;
		this.name = name;
	}

	public Checking(long accountNumber, double accountBalance, double annualInterestRate, String name)
	//This constructor will take account number , account balance, annual interest rate and string name 
	{
		//IT is storing every type of variable given in the argument   
		this.annualInterestRate = annualInterestRate; 
		this.accountBalance = accountBalance;
		this.accountNumber = accountNumber;
		this.name = name;
	}

	public double getAnnualInterestRate() // This will return annual interest rate  a getter method for annual interest rate basically 
 	{
		return annualInterestRate;  
	}

	public void setAnnualInterestRate(double annualInterestRate) // This will set annual interest rate 
	{
		this.annualInterestRate = annualInterestRate;
	}

	public String getName()//This will return name 
	{
		return name;
	}

	@Override
	public void setAccountBalance(double accountBalance)//This is the method we must create because we cerated the abstract method before
	{
		this.accountBalance = accountBalance;
	}

	public void makeDeposit(double depositAmount)// I need to  make deposit 
	{
		accountBalance = accountBalance + depositAmount;
	}

	public void makeWithdrawal(double withdrawal) throws FileNotFoundException
	{

		if ((accountBalance - (withdrawal - 1)) >= 0)
		{
			accountBalance = accountBalance - withdrawal - 1;
		} else

		{
			PrintWriter q = new PrintWriter("output.txt");
			System.out.println("overdraft");
			q.println("overdraft");
			q.close();
			System.exit(0);
		}
	}

}
