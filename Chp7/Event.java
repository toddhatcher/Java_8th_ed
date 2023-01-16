// Event.java
// Chp7
// TH


public class Event
{
	public final static int LOW_PPRICE_PER_GUEST = 32;
	public final static int HIGH_PRICE_PER_GUEST = 35;
	public final static int LARGE_EVENT = 50;
	
	private String eventNumber;
	private String contactPhone; // Chp7 addition
	
	private int	numberOfGuests;
	private int eventPrice;
	private int pricePerGuest;
	
	public Event()
	{
		// Passes A000, 0000000000, 0 to the 3 param constructor.
		this("A000", "0000000000", 0);
	}
	
	public Event(String eventNum, String phoneNum, int numGuests)
	{
		// Accepts event number and guests.
		// Pass values to setEventNumber and setGuests methods.
		this.setEventNumber(eventNum);
		this.setContactPhone(phoneNum);
		this.setGuests(numGuests);
	}

	public boolean isLargeEvent()
	{
		// returns true if numGuest >= 50
		// otherwise return false
		if(this.numberOfGuests >= 50)
		{
			return true;
		}
		else if(this.numberOfGuests < 50)
		{
			return false;
		}
		else
		{
			// Error on numberOfGuests
			System.out.println("Error with number of guests. Cannot determine event size.");
			return false;
		}

	}
	
	// Check argument e to ensure that the value of e is a 4 character string, starting with a letter and 3 digits.
	// Force event number to A000 if the value fails the checks.
	// Upgrade the initial letter to uppercase if not.
	public void setEventNumber(String e)
	{
		// Check string e for compliance
		if((e.length() == 4)
			&& (Character.isAlphabetic(e.charAt(0)))
			&& (Character.isDigit(e.charAt(1)))
			&& (Character.isDigit(e.charAt(2)))
			&& (Character.isDigit(e.charAt(3))))
			{
				eventNumber = e;
				eventNumber = Character.toUpperCase(e.charAt(0)) + e.substring(1);
			}
		else
		{
			eventNumber = "A000";
		}
		//eventNumber = e; // ???? This line?
	}

	public void setContactPhone(String p)
	{
		// Allow any combo of digits, spaces, dashes, dots, parenthesis for the phone number.
		// Step through string looking for isDigit and storing only digit characters.
		int phoneNumberLength = p.length(); 
		String phoneNumberFormatted = "";

		for(int i = 0; i<phoneNumberLength; i++)
		{
			// New String = p.nextInt();
			// Or New StringBuffer = p.nextInt()?
			//StringBuffer cleanPhone = p.nextInt();
			if (Character.isDigit(p.charAt(i)))
			{
				phoneNumberFormatted += p.charAt(i);
			}
		}

		// Now check the formatted Phone Number length. If it's any length besides 10, 
		// store the phone number as all zeros.

		// Get length first then check
		int formattedPhoneNumberLength = phoneNumberFormatted.length();

		if (formattedPhoneNumberLength < 10 || formattedPhoneNumberLength > 10)
		{
			contactPhone =  "0000000000";
		}
		else
		{
			contactPhone = phoneNumberFormatted;
		}
	}
	
	public void setGuests(int g)
	{
		numberOfGuests = g;

		if(isLargeEvent() == true)
		{
			// If Over 50 guests, use LOW_PRICE_PER_GUEST
			pricePerGuest = LOW_PPRICE_PER_GUEST;
		}
		else if(isLargeEvent() == false)
		{
			// Small event < 50 uses HIGH_PRICE_PER_GUEST
			pricePerGuest = HIGH_PRICE_PER_GUEST;
		}
		
		// Calculate event price
		eventPrice = numberOfGuests * pricePerGuest;
	}

	public String getContactPhone()
	{
		// Put ( ) around area code followed by a space, followed by 3 digits, then a hyphen, then last for digits.
		String outputContactPhone;
		outputContactPhone = "(" + contactPhone.substring(0, 3) + ") " + 
			contactPhone.substring(3, 6) + "-" + contactPhone.substring(6, 10);

		return outputContactPhone;
	}
	
	public String getEventNumber()
	{
		return eventNumber;
	}
	
	public int getNumberOfGuests()
	{
		return numberOfGuests;
	}
	
	public int getEventPrice()
	{
		return eventPrice;
	}

	public int getPricePerGuest()
	{
		return pricePerGuest;
	}
}