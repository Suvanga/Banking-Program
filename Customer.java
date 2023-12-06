
public class Customer extends Person //Person class is extended as per the instructions
{
	public Customer(String name, String address, String licenseNumber) throws Exception
	{
		this.name = name; // this will store  the name variable with the given input that is name so we have used this. function just to make sure same goes with address
		this.address= address;//
		char a = licenseNumber.charAt(0);  
		char b = licenseNumber.charAt(1);
		if(licenseNumber.length() == 8 && ((a>=97 && a<=122 || a>=65 && a<=90) && ((b>=97 && b<=122) || b>=65 && b<=90))) //This function is used to check license number
			{
				this.licenseNumber = licenseNumber;
			}
		else 
			{
				throw new Exception("invalid licenseNumber");//This will throw an error 
			}
	}
	
}

