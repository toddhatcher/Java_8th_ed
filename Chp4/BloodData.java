
// BloodData.java

public class BloodData
{
	// Fields
	// Blood Type
	// RH Factor - or +
	private String bloodType;
	private char rhFactor;
	
	// Default Constructor
	// Sets field to "O" and "+"
	public BloodData()
	{
		bloodType = "O";
		rhFactor = '+';
	}
	
	// Overloaded Constructor
	public BloodData(String bloodT, char rh)
	{
		bloodType = bloodT;
		rhFactor = rh;
	}
	
	// Get and Set methods for both fields.
	public String getBloodType()
	{
		return bloodType;
	}
	
	public void setBloodType(String bloodT)
	{
		bloodType = bloodT;
	}
	
	public char getRhFactor()
	{
		return rhFactor;
	}
	
	public void setRhFactor(char rh)
	{
		rhFactor = rh;
	}
}