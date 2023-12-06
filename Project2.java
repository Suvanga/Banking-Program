import java.io.*;
import java.util.Scanner;
/*Name : Suvanga Dhakal
 * Instructor : Dr. Joseph Hobbs 
 * Course : EECS1510 Sec:001 
 * Program name : We have to create a banking system with checking, savings, account and overall things   
 */
public class Project2
{
//Here we go :)
	public static void main(String[] args) throws FileNotFoundException
	{
		String objectType; // This is to declare object type name
		// creating a file object
		File file = new File("input.txt"); // Creating a file object that inherits the File class

		// creating a printWriter
		PrintWriter p = new PrintWriter("output.txt");
		// Declare a input Scanner
		Scanner input; // Declaring input of Scanner type
		// Scanner input = new Scanner("file");(IGNORE THIS LINE)

		try// Any error will be caught down and will be put into the catch statement
		{

			input = new Scanner(file); //
			// input = new Scanner(System.in);
			objectType = input.nextLine(); // it helps us choose the object we want to create
			do
			{
				// use the switch type to choose the desired object type
				switch (objectType)
				{
//If the employee class is chosen it will go through this switch case 
				case "Employee":
				{
					int constructorSelector = Integer.parseInt(input.nextLine()); // constructor selector gives the opt
																					// for user to choose the
																					// constructor of the object type

					if (constructorSelector == 1)
					{
						Employee E; // declaring E as the employee object
						String Ename = input.nextLine(); // this will store
						String Eaddress = input.nextLine();// this will take address as input and store it into the
															// variable Eaddress(ignore spelling mistake)
						String ElicenseNumber = input.nextLine(); // this line causes the String type variable to be
																	// stored into ElicenseNumber
						int EemployeeID = Integer.parseInt(input.nextLine());// this line will store the EmployeeID as
																				// an integer type variable from the
																				// file

						E = new Employee(Ename, Eaddress, ElicenseNumber, EemployeeID);// Here we called the desired
																						// constructor storing required
																						// arguments into the memory
																						// location

						int emethodnum;// emethodnum will store the required method number to be used as an integer type
						emethodnum = Integer.parseInt(input.nextLine());// this will store the next line as emethod_num
						if (emethodnum == 0)// If user just wants to create the constructor and exit then this will help
						{
						} else// else if the user selects to choose the required method it will do so sending
								// the method into the do loop
						{
							do// This is done to set the method input given by the user to be set into the
								// loop so that they can choose as many methods as they want
							{

								switch (emethodnum)
								{
								// method 1 will be operated
								case 1: // method 1 will be called //method 1 will be operated
								{

									String EName = E.getName(); //  To enter name
									System.out.println(EName);	// To print in the console
									p.println(Ename); // To print in the output.txt

									break;
								}
								case 2: // method 2 will be called
								{
									String E_address = E.getAddress(); // To enter address from file 
									System.out.println(E_address); //To enter address from the input file and print into console   
									p.println(E_address); // To enter address from the input file and print into output.txt 
									break;
								}
								case 3: // method 3 will be called
								{
									String E_LicenseNumber = E.getLicenseNumber(); // To create the license number and storing into string variable
									System.out.println(E_LicenseNumber); // Printing the variable in the console
									p.println(E_LicenseNumber);//Printing the variable into output.txt 
									break;
								}
								case 4: // Method 4 will be called 
								{
									int EmployeeId = E.getEmployeeID(); // Employee ID is  declared to be printed and which stores fetemployeeID method from the Employee case
									System.out.println(EmployeeId); // Printing the employee ID in the console 
									p.println(EmployeeId); // Printing the employeeID in the output.txt file
									break;
								}
								case 5: // method 5 will be called
								{
									String names = input.nextLine(); // set the name into the names variable
									E.setName(names);//calling the E.setName

									break;
								}
								case 6: // method 6 will be called
								{
									String Address = input.nextLine(); // setting the address into the the Address variable  
									E.setAddress(Address); //Calling the Address  
									break;
								}

								case 7: // method 7 will be called
								{

									String licenseNum = input.nextLine(); // This will store the license number
									E.setLicenseNumber(licenseNum); // Set the license number as the given input by the input.txt file
									break;
								}
								case 8: // method 8 will be called
								{
									int employeeId = Integer.parseInt(input.nextLine());
									E.setEmployeeID(employeeId);// Set the Employee ID number as the given input by the input.txt file
									break;
								}
								}
								emethodnum = Integer.parseInt(input.nextLine()); // Take method number input 
							} while (emethodnum != 0);//It will exit the code if the methodnum is 0
						}
					}

				}
					break; 

				case "Customer": // This case will be selected if you choose "customer" to be stored in the object type variable
				{

					int constructorSelector = Integer.parseInt(input.nextLine()); // 	It selects the constructor while creating the customer object type 
					if (constructorSelector == 1) // the constructorSelector will use the input and set into the required constructor to be created 
					{
						Customer c; // creates c as  name for creating customer object type  
						String name = input.nextLine();  //this will input name into name 
						String address = input.nextLine();// this will be input address from input.txt into this variable
						String licenseNumber = input.nextLine(); // The license number is stored inside the license number

						c = new Customer(name, address, licenseNumber); // this will create a customer object type stored in c which can inherit methods from customer class

						int methodnum; // This will create a methodnum named variable as integer type to choose the respective integer

						methodnum = Integer.parseInt(input.nextLine());
						if (methodnum == 0)//This will do nothing//This will do nothing
						{

						} else
						{
							do// This is done to set the method input given by the user to be set into the
								// loop so that they can choose as many methods as they want
							{

								switch (methodnum)
								{
								case 1: // method 1 will be called //method 1 will be operated
								{
									String Cname = c.getName(); // This will take c.getName() method value to be stored in the CName so that it can be printed in the console and in the output file  
									System.out.println(Cname);
									p.println(Cname);
								}
									break;

								case 2: // method 2 will be called
								{
									String Caddress = c.getAddress();//Caddress will store the c.getAddress method  which is printed in both console and output.txt file
									System.out.println(Caddress);
									p.println(Caddress);
								}
									break;
								case 3: // method 3 will be called
								{
									String CLicenseNumber = c.getLicenseNumber();//
									System.out.println(CLicenseNumber);
									p.println(CLicenseNumber);
								}
									break;
								case 4: // method 4 will be called 
								{
									String Name = input.nextLine();
									c.setName(Name);
								}
									break;
								case 5: // method 5 will be called
								{
									String Address = input.nextLine();
									c.setAddress(Address);
								}
									break;
								case 6: // method 6 will be called
								{
									String licenseNum = input.nextLine();
									c.setLicenseNumber(licenseNum);
								}
									break;

								}

								methodnum = Integer.parseInt(input.nextLine());
							} while (methodnum != 0);
						}
					}
					break;
				}

				case "Loan":
				{
					int constructorSelector = Integer.parseInt(input.nextLine());
					if (constructorSelector == 1)
					{
						String LName = input.nextLine();
						Loan L1;
						L1 = new Loan(LName);
						int methodnum;
						methodnum = Integer.parseInt(input.nextLine());
						if (methodnum == 0)//This will do nothing
						{

						} else //This is operated if they don't use 0 as input in the first case itself
						{
							do// This is done to set the method input given by the user to be set into the
								// loop so that they can choose as many methods as they want
							{

								switch (methodnum)
								{
								case 1: // method 1 will be called //method 1 will be operated
								{
									double LacBalance = L1.getAccountBalance();
									System.out.printf("%.2f", LacBalance);
									System.out.println();
									p.printf("%.2f", LacBalance);
									p.println();
								}
									break;
								case 2: // method 2 will be called
								{
									long Lacnumber = L1.getAccountNumber();
									System.out.println(Lacnumber);
									p.println(Lacnumber);
								}
									break;
								case 3: // method 3 will be called
								{
									double LanualIR = L1.getAnnualInterestRate();
									System.out.println(LanualIR);
									p.println(LanualIR);
								}
									break;
								case 4: // method 4 will be called
								{
									int LNOY = L1.getNumberOfYears();
									System.out.println(LNOY);
									p.println(LNOY);
								}
									break;
								case 5: // method 5 will be called
								{
									L1.getLoanDate(); 
									System.out.println(L1.getLoanDate());
									p.println(L1.getLoanDate());
								}
									break;
								case 6: // method 6 will be called
								{
									String Lname = L1.getName();
									System.out.println(Lname);
									p.println(Lname);
								}
									break;
								case 7: // method 7 will be called
								{
									double acbalance = Double.parseDouble(input.nextLine());
									L1.setAccountBalance(acbalance);

								}
									break;
								case 8: // method 8 will be called
								{
									double anualrate = Double.parseDouble(input.nextLine());
									L1.setAnnualInterestRate(anualrate);

								}
									break;

								case 9: // method 9 will be called
								{
									L1.setNumberOfYears(Integer.parseInt(input.nextLine()));
								}
									break;

								case 10: // method 10 will be called
								{
									double monthlypayment = L1.getMonthlyPayment();

									System.out.printf("%.2f", monthlypayment);
									System.out.println();
									p.printf("%.2f", monthlypayment);
									p.println();
								}
									break;

								case 11: // method 11 will be called
								{
									double total_payment = L1.getTotalPayment();
									System.out.printf("%.2f", total_payment);
									System.out.println();
									p.printf("%.2f", total_payment);
									p.println();
								}
									break;

								}

								methodnum = Integer.parseInt(input.nextLine());

							} while (methodnum != 0);
						}
					}

					if (constructorSelector == 2)
					{
						long Lacnum2 = Long.parseLong(input.nextLine());
						double Lacbalance2 = Double.parseDouble(input.nextLine());
						double LanualIrate2 = Double.parseDouble(input.nextLine());
						int LNOY2 = Integer.parseInt(input.nextLine());
						String LName2 = input.nextLine();

						Loan L2;
						L2 = new Loan(Lacnum2, Lacbalance2, LanualIrate2, LNOY2, LName2);
						int Lmethodnum2;
						Lmethodnum2 = Integer.parseInt(input.nextLine());
						if (Lmethodnum2 == 0)
						{

						} else//This is operated if they don't use 0 as input in the first case itself
						{
							do// This is done to set the method input given by the user to be set into the
								// loop so that they can choose as many methods as they want
							{

								switch (Lmethodnum2)
								{
								case 1: // method 1 will be called //method 1 will be operated
								{
									double LacBalance2 = L2.getAccountBalance();
									System.out.printf("%.2f", LacBalance2);
									System.out.println();
									p.printf("%.2f", LacBalance2);
									p.println();
								}
									break;
								case 2: // method 2 will be called
								{
									long L2acnumber = L2.getAccountNumber();
									System.out.println(L2acnumber);
									p.println(L2acnumber);
								}
									break;
								case 3: // method 3 will be called
								{
									double L2anualInteresrtRate = L2.getAnnualInterestRate();
									System.out.println(L2anualInteresrtRate);
									p.println(L2anualInteresrtRate);
								}
									break;
								case 4: // method 4 will be called
								{
									int L2NOY = L2.getNumberOfYears();
									System.out.println(L2NOY);
									p.println(L2NOY);
								}
									break;
								case 5: // method 5 will be called
								{
									L2.getLoanDate();
									System.out.println(L2.getLoanDate());
									p.println(L2.getLoanDate());
								}
									break;
								case 6: // method 6 will be called
								{
									String Lname2 = L2.getName();
									System.out.println(Lname2);
									p.println(Lname2);
								}
									break;

								case 7: // method 7 will be called
								{
									double acbalance = Double.parseDouble(input.nextLine());
									L2.setAccountBalance(acbalance);
								}
									break;
								case 8: // method 8 will be called
								{
									double anualrate = Double.parseDouble(input.nextLine());
									L2.setAnnualInterestRate(anualrate);

								}
									break;

								case 9: // method 9 will be called
								{
									int NOY = Integer.parseInt(input.nextLine());
									L2.setNumberOfYears(NOY);
								}
									break;

								case 10: // method 10 will be called
								{
									double L2monthlypayment = L2.getMonthlyPayment();
									System.out.println(L2monthlypayment);
									p.println(L2monthlypayment);
								}
									break;

								case 11: // method 11 will be called
								{
									double total_payment = L2.getTotalPayment();
									System.out.println(total_payment);
									p.println(total_payment);
								}
									break;

								}

								Lmethodnum2 = Integer.parseInt(input.nextLine());
							} while (Lmethodnum2 != 0);
						}
					}
					break;
				}

				case "Checking":
				{
					int constructorSelector = Integer.parseInt(input.nextLine());
					if (constructorSelector == 1)
					{
						double anualInterestRates = Double.parseDouble(input.nextLine());
						String names = input.nextLine();
						Checking C1;
						C1 = new Checking(anualInterestRates, names);
						int methodnumC1;
						methodnumC1 = Integer.parseInt(input.nextLine());
						if (methodnumC1 == 0)
						{

						} else//This is operated if they don't use 0 as input in the first case itself
						{
							do// This is done to set the method input given by the user to be set into the
								// loop so that they can choose as many methods as they want
							{
								switch (methodnumC1)
								{

								case 1: // method 1 will be called //method 1 will be operated
								{
									double C1acbalance = C1.getAccountBalance();
									System.out.printf("%.2f", C1acbalance);
									System.out.println();
									p.printf("%.2f", C1acbalance);
									p.println();

								}
									break;
								case 2: // method 2 will be called
								{
									long C1Acbalance = C1.getAccountNumber();
									System.out.println(C1Acbalance);
									p.println(C1Acbalance);
								}
									break;
								case 3: // method 3 will be called
								{
									double ch_acbalance = Double.parseDouble(input.nextLine());
									C1.setAccountBalance(ch_acbalance);
								}
									break;
								case 4: // method 4 will be called
								{
									double C1anualinterestrate = C1.getAnnualInterestRate();
									System.out.printf("%.2f", C1anualinterestrate);
									System.out.println();
									p.printf("%.2f", C1anualinterestrate);
									p.println();
								}
									break;
								case 5: // method 5 will be called
								{
									String C1Name = C1.getName();
									System.out.println(C1Name);
									p.println(C1Name);
								}
									break;

								case 6: // method 6 will be called
								{
									double ch_anualInterestRate = Double.parseDouble(input.nextLine());
									C1.setAnnualInterestRate(ch_anualInterestRate);
								}
									break;

								case 7: // method 7 will be called
								{
									double ch_deposit = Double.parseDouble(input.nextLine());
									C1.makeDeposit(ch_deposit);
								}
									break;
								case 8: // method 8 will be called
								{
									double ch_withdrawal = Double.parseDouble(input.nextLine());
									C1.makeWithdrawal(ch_withdrawal);
								}
									break;
								}

								methodnumC1 = Integer.parseInt(input.nextLine());
							} while (methodnumC1 != 0);
						}
					}
					if (constructorSelector == 2)
					{
						long Ch2accountNumber = Long.parseLong(input.nextLine());
						double Ch2accountBalance = Double.parseDouble(input.nextLine());
						double Ch2annualInterestRate = Double.parseDouble(input.nextLine());
						String Ch2name = input.nextLine();
						Checking C2;
						C2 = new Checking(Ch2accountNumber, Ch2accountBalance, Ch2annualInterestRate, Ch2name);
						int methodnumC2;
						methodnumC2 = Integer.parseInt(input.nextLine());
						if (methodnumC2 == 0)
						{

						} else //This is operated if they don't use 0 as input in the first case itself
						{

							do// This is done to set the method input given by the user to be set into the
								// loop so that they can choose as many methods as they want
							{
								switch (methodnumC2)
								{

								case 1: // method 1 will be called //method 1 will be operated
								{
									double C2Acbalance = C2.getAccountBalance();

									System.out.printf("%.2f", C2Acbalance);
									System.out.println();
									p.printf("%.2f", C2Acbalance);
									p.println();
								}
									break;
								case 2: // method 2 will be called
								{
									long C2Acnum = C2.getAccountNumber();
									System.out.println(C2Acnum);
									p.println(C2Acnum);
								}
									break;
								case 3: // method 3 will be called
								{
									double ch_acbalance = Double.parseDouble(input.nextLine());
									C2.setAccountBalance(ch_acbalance);
								}
									break;
								case 4: // method 4 will be called
								{
									double C2AcBalance = C2.getAnnualInterestRate();
									System.out.println(C2AcBalance);
									p.println(C2AcBalance);
								}
									break;
								case 5: // method 5 will be called
								{
									String C2Name = C2.getName();
									System.out.println(C2Name);
									p.println(C2Name);
								}
									break;

								case 6: // method 6 will be called
								{
									double ch_anualInterestRate = Double.parseDouble(input.nextLine());
									C2.setAnnualInterestRate(ch_anualInterestRate);
								}
									break;

								case 7: // method 7 will be called
								{
									double ch_deposit = Double.parseDouble(input.nextLine());
									C2.makeDeposit(ch_deposit);
								}
									break;
								case 8: // method 8 will be called
								{
									double ch_withdrawal = Double.parseDouble(input.nextLine());
									C2.makeWithdrawal(ch_withdrawal);
								}
									break;
								}

								methodnumC2 = Integer.parseInt(input.nextLine());
							} while (methodnumC2 != 0);
						}
					}

				}
					break;

				case "Savings":
				{
					int constructorSelector = Integer.parseInt(input.nextLine());
					if (constructorSelector == 1)
					{
						double S1annualInterestRate = Double.parseDouble(input.nextLine());
						String S1name = input.nextLine();
						Savings S1;
						S1 = new Savings(S1annualInterestRate, S1name);
						int methodnumS1;
						methodnumS1 = Integer.parseInt(input.nextLine());
						if (methodnumS1 == 0)
						{
						} else //This is operated if they don't use 0 as input in the first case itself
						{
							do// This is done to set the method input given by the user to be set into the
								// loop so that they can choose as many methods as they want
							{
								switch (methodnumS1)
								{
								case 1: // method 1 will be called //method 1 will be operated
								{
									double S1Acountbalance = S1.getAccountBalance();
									System.out.printf("%.2f", S1Acountbalance);
									System.out.println();
									p.printf("%.2f", S1Acountbalance);
									p.println();
								}
									break;

								case 2: // method 2 will be called
								{
									long S1acNum = S1.getAccountNumber();
									System.out.println(S1acNum);
									p.println(S1acNum);
								}
									break;

								case 3: // method 3 will be called
								{
									double accountBalanceS1 = Double.parseDouble(input.nextLine());
									S1.setAccountBalance(accountBalanceS1);
								}
									break;

								case 4: // method 4 will be called
								{
									double S1AnualinterestRate = S1.getAnnualInterestRate();
									System.out.println(S1AnualinterestRate);
									p.println(S1AnualinterestRate);
								}
									break;

								case 5: // method 5 will be called
								{
									String S1_Name = S1.getName();
									System.out.println(S1_Name);
									p.println(S1_Name);
								}
									break;

								case 6: // method 6 will be called
								{
									double S1_annualInterestRate = Double.parseDouble(input.nextLine());
									S1.setAnnualInterestRate(S1_annualInterestRate);

								}
									break;

								case 7: // method 7 will be called
								{
									double S1deposit = Double.parseDouble(input.nextLine());
									S1.makeDeposit(S1deposit);
								}
									break;

								case 8: // method 8 will be called
								{
									double S1withdrawal = Double.parseDouble(input.nextLine());
									S1.makeWithdrawal(S1withdrawal);
								}
									break;

								}
								methodnumS1 = Integer.parseInt(input.nextLine());
							} while (methodnumS1 != 0);
						}

					}
//call the second constructor as the user choose our constructor selector to be of that type 
					if (constructorSelector == 2)
					{
						// I have created different variables to store it as an argument I didn't
						// directly put the lines into argument so that it will be easier to fix errors
						// and stuff
						long acnum = Long.parseLong(input.nextLine());
						double acbalance = Double.parseDouble(input.nextLine());
						double interestRate = Double.parseDouble(input.nextLine());
						String S2Name = input.nextLine();
						Savings S2;
						S2 = new Savings(acnum, acbalance, interestRate, S2Name);

						int methodnumS2;
						methodnumS2 = Integer.parseInt(input.nextLine());
						if (methodnumS2 == 0)
						{
						} else //This is operated if they don't use 0 as input in the first case itself
						{

							do// This is done to set the method input given by the user to be set into the
								// loop so that they can choose as many methods as they want
							{
								switch (methodnumS2)
								{
								case 1: // method 1 will be called //method 1 will be operated
								{
									double S2Acountbalance = S2.getAccountBalance();
									System.out.printf("%.2f", S2Acountbalance);
									System.out.println();
									p.printf("%.2f", S2Acountbalance);
									p.println();
								}
									break;

								case 2: // method 2 will be called
								{
									long S2acNum = S2.getAccountNumber();
									System.out.println(S2acNum);
									p.println(S2acNum);
								}
									break;

								case 3: // method 3 will be called
								{
									double accountBalanceS2 = Double.parseDouble(input.nextLine());
									S2.setAccountBalance(accountBalanceS2);
								}
									break;

								case 4: // method 4 will be called
								{
									double S2AnualinterestRate = S2.getAnnualInterestRate();
									System.out.println(S2AnualinterestRate);
									p.println(S2AnualinterestRate);
								}
									break;

								case 5: // method 5 will be called
								{
									String S2_Name = S2.getName();
									System.out.println(S2_Name);
									p.println(S2_Name);

								}
									break;

								case 6: // method 6 will be called
								{
									double S2_annualInterestRate = Double.parseDouble(input.nextLine());
									S2.setAnnualInterestRate(S2_annualInterestRate);

								}
									break;

								case 7: // method 7 will be called
								{
									double S2deposit = Double.parseDouble(input.nextLine());
									S2.makeDeposit(S2deposit);
								}
									break;

								case 8: // method 8 will be called
								{
									double S2withdrawal = Double.parseDouble(input.nextLine());
									S2.makeWithdrawal(S2withdrawal);

								}
									break;
								}
								methodnumS2 = Integer.parseInt(input.nextLine());//This will be executed to store the method caller to see if it is going be terminated or not
							} while (methodnumS2 != 0);
						}

					}

				}
					break;
				}
				objectType = input.nextLine(); // This will check  if the last thing the user wants is to terminate or create a new object type and it terminates accordingly  
			} while (!objectType.equals("0")); // This will see if object type is equal to string type "0" which is why I used .equals("") method , Thanks Jacob for this 
			input.close(); // this will close the scanner input
			p.close(); // This just closes the PrintWriter 
		}

		catch (Exception exe)
		{
			System.out.println("error");//This will print error in the console  
			p.println("error"); // this will print the error in the output.txt file 
			p.close(); // This just closes the PrintWriter
			System.exit(1); //This exits the program
		}
	}

}
