// Rental.java

public class Rental
{
	public final static int MINUTES_IN_HOUR = 60;
	public final static int HOURLY_RATE = 40;
	
	private String contractNumber;
	private int hoursOfRent;
	private int minutesOverHour;
	private int priceOfRental;
	
	// Default Constructor
	public Rental()
	{
		// Default values - A000 and 0
		this("A000", 0);
	}
	
	// Overloaded Constructor
	public Rental(String conNum, int minutes)
	{
		// Pass values to setContractNumber, setHoursAndMinutes
		this.setContractNumber(conNum);
		this.setHoursAndMinutes(minutes);
	}
	
	// set contract number
	public void setContractNumber(String c)
	{
		contractNumber = c;
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
			priceOfRental = hoursOfRent * HOURLY_RATE + minutesOverHour;
		}
		
	}
	// get contractNumber
	public String getContractNumber()
	{
		return contractNumber;
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
}