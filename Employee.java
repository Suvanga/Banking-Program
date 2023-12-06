public class Employee extends Person
{
	protected int employeeID; //Creating employeeID as protected as Jacob Hobbs told in the video

	public Employee(String name, String address, String licenseNumber, int employeeID)
	{
//This is the first constructor it is used to create name address and licensenumber, and employee Id , in this case we don't have a default constructor 
		this.name = name;
		this.address = address;
		this.licenseNumber = licenseNumber;

		String employee = employeeID + "";

		if (employee.length() < 8) // If its is less than 8
		{
			for (int i = 0; i < (8 - (employee.length())); i++)//it will run a loop for as many time as it is required
			{
				employee = "0" + employee; // It is used to add "0" as to employee
			}
			this.employeeID = Integer.parseInt(employee); //this will change the String type to integer type
		} else
		{
			this.employeeID = employeeID;//Else it will just simply store
		}

	}

	public int getEmployeeID()//this is a getter  method to get employeeID  
	{
		return employeeID;
	}

	public void setEmployeeID(int employeeID)//This will take arguments to employeeID
	{
		this.employeeID = employeeID;
	}

}