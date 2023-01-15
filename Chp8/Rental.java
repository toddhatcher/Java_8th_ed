// Rental.java
// Chp8

public class Rental
{
	public final static int MINUTES_IN_HOUR = 60;
	public final static int HOURLY_RATE = 40;
	public final static String[] EQUIPMENT_TYPES = {"jet ski", "pontoon boat", "rowboat", "canoe", "kayak", "beach chair", "umbrella", "other"};
	
	private String contractNumber;
	private String contactPhoneNumber;
	private int equipmentType;
	private int hoursOfRent;
	private int minutesOverHour;
	private int priceOfRental;
	private int totalMinutes;
	
	// Default Constructor
	public Rental()
	{
		// Default values - A000 and 0
		this("A000", 7, "0000000000", 0);
	}
	
	// Overloaded Constructor
	public Rental(String conNum, int equipType, String phoneNum, int minutes)
	{
		totalMinutes = minutes;
		// Pass values to setContractNumber, setHoursAndMinutes
		this.setEquipmentType(equipType);
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

	public void setEquipmentType(int t) {
		// If t > size of Equipment Types, default to other. Other = 7.
		if (t > EQUIPMENT_TYPES.length) {
			this.equipmentType = 7;
		}
		else {
			this.equipmentType = t;
		}
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

	// get equipment type
	public int getEquipmentType() {
		int result;
		switch (equipmentType) {
			case 0:
				result = 0;
				break;
			case 1:
				result = 1;
				break;
			case 2:
				result = 2;
				break;
			case 3:
				result = 3;
				break;
			case 4:
				result = 4;
				break;
			case 5:
				result = 5;
				break;
			case 6:
				result = 6;
				break;
			case 7:
				result = 7;
				break;
			default:
				result = 7;
				break;
		}
		return result;
	}

	// get equipment type as String
	public String getEquipmentTypeAsString() {	
		if (equipmentType == 0)
		{
			return EQUIPMENT_TYPES[0];
		}
		else if (equipmentType == 1)
		{
			return EQUIPMENT_TYPES[1];
		}
		else if (equipmentType == 2)
		{
			return EQUIPMENT_TYPES[2];
		}
		else if (equipmentType == 3)
		{
			return EQUIPMENT_TYPES[3];
		}
		else if (equipmentType == 4)
		{
			return EQUIPMENT_TYPES[4];
		}
		else if (equipmentType == 5)
		{
			return EQUIPMENT_TYPES[5];
		}
		else if (equipmentType == 6)
		{
			return EQUIPMENT_TYPES[6];
		}
		else if (equipmentType == 7)
		{
			return EQUIPMENT_TYPES[7];
		}
		else {
			return EQUIPMENT_TYPES[7];
		}
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