public class Loan extends Account// This will extend account 
{
	//We declare  types of variable related with the stuff that should not be changed so it is private 
	private double annualInterestRate;
	private int numberOfYears;
	private java.util.Date loanDate;
	private String name;

	public Loan(String name)//Creating first constructor which takes names as input 
	{
		super();
		this.name = name;
		loanDate = new java.util.Date();
	}

	public Loan(long accountNumber, double accountBalance, double annualInterestRate, int numberOfYears, String name)// This will  second constructor which takes acnum, acbal, anual rate, number of years and string name as arguments  
	{
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.name = name;

		loanDate = new java.util.Date();

	}

	public double getAnnualInterestRate() //This will return annual interest rate 
	{
		return annualInterestRate;
	}

	public int getNumberOfYears() //This will return number of years if called 
	{
		return numberOfYears;
	}

	public java.util.Date getLoanDate() // This will return date if called
	{
		return loanDate;
	}

	public String getName()// This will return name to the main method if called to be printed
	{
		return name;
	}

	public void setAnnualInterestRate(double annualInterestRate) //This will set annual interest rate into the current annual interest rate variable used in this class 
	{
		this.annualInterestRate = annualInterestRate;
	}

	public void setNumberOfYears(int numberOfYears)// This will set Number of years which is given by input.txt
	{
		this.numberOfYears = numberOfYears;
	}

	public double getMonthlyPayment() //This will give monthly payment I have used the given formula from the given proj descriptions 
	{
		return (accountBalance * (annualInterestRate / 1200)) / (1 - (1 / Math.pow((1 + (annualInterestRate / 1200)), (numberOfYears * 12))));//Did not want to declare variable so did it directly 
	}

	public double getTotalPayment()
	{

		return getMonthlyPayment() * numberOfYears * 12; // This will use the getMonthlypayment method from above to calculate total payment in a year, again I did not want to use more variable however I have used a lot in  the main method so that it will be easier to understand the error 
	}

	@Override
	public void setAccountBalance(double accountBalance)// This is a mandatory method 
	{
		this.accountBalance = accountBalance;
	}

}