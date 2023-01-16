// Rental.java
// Chp7

public class Rental
{
	public final static int MINUTES_IN_HOUR = 60;
	public final static int HOURLY_RATE = 40;
	
	private String contractNumber;
	private String contactPhoneNumber;
	private int hoursOfRent;
	private int minutesOverHour;
	private int priceOfRental;
	private int totalMinutes;
	
	// Default Constructor
	public Rental()
	{
		// Default values - A000 and 0
		this("A000", "0000000000",0);
	}
	
	// Overloaded Constructor
	public Rental(String conNum, String phoneNum, int minutes)
	{
		totalMinutes = minutes;
		// Pass values to setContractNumber, setHoursAndMinutes
		this.setContractNumber(conNum);
		this.setContactPhoneNumber(phoneNum);
		this.setHoursAndMinutes(minutes);
	}
	
	// set contract number
	public void setContractNumber(String c)
	{
		if ((c.length() == 4)
				&& (Character.isAlphabetic(c.charAt(0)))
				&& (Character.isDigit(c.charAt(1)))
				&& (Character.isDigit(c.charAt(2)))
				&& (Character.isDigit(c.charAt(3))))
				{
					contractNumber = c;
					contractNumber = Character.toUpperCase(c.charAt(0)) + c.substring(1);
				}
		else
		{
			contractNumber = "A000";
		}
		
		// contractNumber = c;
	}

	public void setContactPhoneNumber(String phoneNumber)
	{
		// Allow any combo of digits, spaces, dashes, dots, parenthesis to be input as the phone number.
		// Store as all digits.
		// Step through string looking for isDigit and storing only digit characters.
		String formattedPhoneNumber = "";
		int phoneNumberLength = phoneNumber.length();

		// For loop then if statement to check for CharAt is digit
		for (int i = 0; i < phoneNumberLength; i++) {
			if (Character.isDigit(phoneNumber.charAt(i)))
			{
				formattedPhoneNumber += phoneNumber.charAt(i);
			}

		}

		// Now check the formatted Phone Number length. If it's any length besides 10, 
		// store the phone number as all zeros.
		int formattedPhoneNumberLength = formattedPhoneNumber.length();

		if (formattedPhoneNumberLength < 10 || formattedPhoneNumberLength > 10)
		{
			contactPhoneNumber = "0000000000";
		}
		else
		{
			contactPhoneNumber = formattedPhoneNumber;
		}
	}

	// setHoursAndMinutes
	public void setHoursAndMinutes(int m)
	{
		if(m < 60)
		{
			hoursOfRent = m / MINUTES_IN_HOUR;
			minutesOverHour = m % MINUTES_IN_HOUR;
			priceOfRental = HOURLY_RATE;
		}
		else
		{
			hoursOfRent = m / MINUTES_IN_HOUR;
			minutesOverHour = m % MINUTES_IN_HOUR;
			if(minutesOverHour > 40)
			{
				// If minutes rented past the hour is greater than 40
				// Only bill for 1 hours cost, aka $40.
				priceOfRental = hoursOfRent * HOURLY_RATE + 40;
			}
			else
			{
				priceOfRental = hoursOfRent * HOURLY_RATE + minutesOverHour;
			}
		}	
	}
	
	// get contractNumber
	public String getContractNumber()
	{
		return contractNumber;
	}

	public String getContactPhoneNumber() {
		String outputContactPhoneNumber;
		outputContactPhoneNumber = "(" + contactPhoneNumber.substring(0, 3) + ")" + 
			" " + contactPhoneNumber.substring(3, 6) + "-" + contactPhoneNumber.substring(6, 10);
		
		return outputContactPhoneNumber;
	}

	// get hoursOfRent
	public int getHoursOfRent()
	{
		return hoursOfRent;
	}
	// get minutesOverHour
	public int getMinutesOverHour()
	{
		return minutesOverHour;
	}
	// get price of Rental
	public int getPriceOfRental()
	{
		return priceOfRental;
	}
	// get total minutes of rental
	public int getTotalMinutes()
	{
		return totalMinutes;
	}
}