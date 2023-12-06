public abstract class Person //This is an abstract class
{
		protected String licenseNumber; // This will be used in other class and is extended and these variables can be used in other classes that are extended
		protected String name;
		protected String address;
		
		public String getLicenseNumber() 
		{
			return licenseNumber; //This will return Licensenumber  
		}
		
		public void setLicenseNumber(String licenseNumber) 
		{
			this.licenseNumber = licenseNumber; //This will Set license number and provides String value to it   
		}
		
		public String getName() 
		{
			return name;
		}
		
		public void setName(String name) //This will Set Name variable to and put  String value to it
		{
			this.name = name;
		}
		
		public String getAddress() //This will return address to the main method if used 
		{
			return address;
		}
		
		public void setAddress(String address) //Set adress will be used to set address into a string data_type int  the address file  
		{
			this.address = address;
		}
}


