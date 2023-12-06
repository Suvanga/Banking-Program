public abstract class Account
{
	protected long accountNumber;
	protected double accountBalance;

	protected Account()
	{
		this.accountNumber = (long) (Math.random() * (9999999999L - 0 + 1));
		this.accountBalance = 0;//
	}

	protected Account(long accountNumber, double accountBalance)
	{
		String acnum = accountNumber + "";
		if (accountNumber < 10)
		{
			for (int i = 0; i < (10 - (acnum.length())); i++)
			{
				acnum = "0" + acnum;
			}
			this.accountNumber = Integer.parseInt(acnum);
		} else
		{
			this.accountNumber = accountNumber;
		}

		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}

	public long getAccountNumber()
	{
		return accountNumber;//
	}

	public double getAccountBalance()
	{
		return accountBalance;
	}

	public abstract void setAccountBalance(double accountBalance);

}
